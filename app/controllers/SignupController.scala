package controllers

import model.Account
import play.api.data.Forms._
import play.api.data._
import play.api.mvc.{Action, _}
import play.api.i18n.Messages.Implicits._
import play.api.Play.current

/**
  * Created by knodus on 29/2/16.
  */
case class UserSignUpData(email:String,password:String,confirm:String)

class SignupController extends Controller{


  val userForm=Form(
    mapping(
      "email" -> email,
      "password" -> nonEmptyText,
      "confirm-password"->nonEmptyText
    )(UserSignUpData.apply)(UserSignUpData.unapply)
      .verifying("Invalid user name or password",result => check(result)
    )
  )


  def check(data: UserSignUpData):Boolean = {
    if(data.password == data.confirm)
      true
    else
      false
  }


  def showSignUpPage =Action { implicit request =>
    Ok(views.html.sign_up(userForm))
  }

  def createUser = Action { implicit request =>
      userForm.bindFromRequest.fold(
        formWithErrors =>{
          BadRequest(views.html.sign_up(formWithErrors))
          //
         },
        UsersData => {
          Ok("User Created")

          Account.createUser(UsersData.email,UsersData.password)
           Redirect(routes.AccountController.showAccountsPage).withSession(
             "connected" -> UsersData.email)


        })
  }

}
