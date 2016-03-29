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

case class UserData(email:String,password:String)

class LoginController extends Controller{

  /**
    *  Login Form Creation
    */



  val userForm=Form(
    mapping(
      "email" -> email,
      "password" -> nonEmptyText
    )(UserData.apply)(UserData.unapply).verifying("Invalid user name or password", result =>
      Account.validate(result.email,result.password)

  )
  )

  def loginPage()=Action{implicit request =>
    Ok(views.html.login(userForm))
  }

  def authenticate = Action { implicit request =>
    userForm.bindFromRequest.fold(
      formWithErrors =>{
        Redirect(routes.LoginController.loginPage()).flashing("error"->"Form Contains Errors")
        //BadRequest(views.html.login(formWithErrors)).flashing("error"->"Form Contains Errors")
  },
        UserData => {

                 Redirect(routes.AccountController.showAccountsPage).withSession(
            "email" -> UserData.email)

      })
  }



}
