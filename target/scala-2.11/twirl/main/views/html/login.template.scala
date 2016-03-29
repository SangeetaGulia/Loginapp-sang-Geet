
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[UserData],Flash,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm:Form[UserData])(implicit flash:Flash,message:Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.66*/("""
"""),format.raw/*3.1*/("""

"""),_display_(/*5.2*/main("login")/*5.15*/{_display_(Seq[Any](format.raw/*5.16*/("""



    """),_display_(/*9.6*/if(flash.get("error").isDefined)/*9.38*/{_display_(Seq[Any](format.raw/*9.39*/("""
      """),format.raw/*10.7*/("""<div class="alert alert-danger">
    <strong>"""),_display_(/*11.14*/flash/*11.19*/.get("error")),format.raw/*11.32*/("""</strong>
            </div>
""")))}),format.raw/*13.2*/("""
"""),format.raw/*14.1*/("""</p>
<h1> Login </h1>
    """),_display_(/*16.6*/helper/*16.12*/.form(action=routes.LoginController.authenticate())/*16.63*/{_display_(Seq[Any](format.raw/*16.64*/("""
    """),_display_(/*17.6*/helper/*17.12*/.inputText(userForm("email"))),format.raw/*17.41*/("""

    """),_display_(/*19.6*/helper/*19.12*/.inputPassword(userForm("password"),'_help->"It should be non-empty")),format.raw/*19.81*/("""
    """),format.raw/*20.5*/("""<input type="submit" value="Login">


""")))}),format.raw/*23.2*/("""

"""),format.raw/*25.1*/("""<a href=""""),_display_(/*25.11*/routes/*25.17*/.SignupController.showSignUpPage),format.raw/*25.49*/(""""> Create New User </a>

""")))}))
      }
    }
  }

  def render(userForm:Form[UserData],flash:Flash,message:Messages): play.twirl.api.HtmlFormat.Appendable = apply(userForm)(flash,message)

  def f:((Form[UserData]) => (Flash,Messages) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => (flash,message) => apply(userForm)(flash,message)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Tue Mar 29 16:42:58 IST 2016
                  SOURCE: /home/knoldus/gitPractice/Loginapp-sang-Geet/app/views/login.scala.html
                  HASH: c0786b06c64f0cc49cc15006eff7023f04fd7c0e
                  MATRIX: 550->1|724->65|751->83|779->86|800->99|838->100|872->109|912->141|950->142|984->149|1057->195|1071->200|1105->213|1165->243|1193->244|1246->271|1261->277|1321->328|1360->329|1392->335|1407->341|1457->370|1490->377|1505->383|1595->452|1627->457|1696->496|1725->498|1762->508|1777->514|1830->546
                  LINES: 20->1|25->1|26->3|28->5|28->5|28->5|32->9|32->9|32->9|33->10|34->11|34->11|34->11|36->13|37->14|39->16|39->16|39->16|39->16|40->17|40->17|40->17|42->19|42->19|42->19|43->20|46->23|48->25|48->25|48->25|48->25
                  -- GENERATED --
              */
          