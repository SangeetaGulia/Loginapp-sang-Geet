
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object sign_up_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class sign_up extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[UserSignUpData],Flash,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm:Form[UserSignUpData])(implicit flash:Flash,message:Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.72*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("login")/*4.15*/{_display_(Seq[Any](format.raw/*4.16*/("""


"""),format.raw/*7.1*/("""<h1 style="text-align:center;">CREATE NEW Account:</h1>
"""),_display_(/*8.2*/helper/*8.8*/.form(action=routes.SignupController.createUser)/*8.56*/{_display_(Seq[Any](format.raw/*8.57*/("""
"""),_display_(/*9.2*/helper/*9.8*/.inputText(userForm("email"))),format.raw/*9.37*/("""
"""),_display_(/*10.2*/helper/*10.8*/.inputPassword(userForm("password"))),format.raw/*10.44*/("""
"""),_display_(/*11.2*/helper/*11.8*/.inputPassword(userForm("confirm-password"))),format.raw/*11.52*/("""
"""),format.raw/*12.1*/("""<input type="submit" value="submit">
<p>
    """),_display_(/*14.6*/flash/*14.11*/.get("error")),format.raw/*14.24*/("""
"""),format.raw/*15.1*/("""</p>

""")))}),format.raw/*17.2*/("""


""")))}))
      }
    }
  }

  def render(userForm:Form[UserSignUpData],flash:Flash,message:Messages): play.twirl.api.HtmlFormat.Appendable = apply(userForm)(flash,message)

  def f:((Form[UserSignUpData]) => (Flash,Messages) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => (flash,message) => apply(userForm)(flash,message)

  def ref: this.type = this

}


}

/**/
object sign_up extends sign_up_Scope0.sign_up
              /*
                  -- GENERATED --
                  DATE: Tue Mar 29 16:42:57 IST 2016
                  SOURCE: /home/knoldus/gitPractice/Loginapp-sang-Geet/app/views/sign_up.scala.html
                  HASH: 482732e8f70822f5ec3197c0a997dfe014bad45a
                  MATRIX: 560->1|740->71|767->89|794->91|815->104|853->105|882->108|964->165|977->171|1033->219|1071->220|1098->222|1111->228|1160->257|1188->259|1202->265|1259->301|1287->303|1301->309|1366->353|1394->354|1466->400|1480->405|1514->418|1542->419|1579->426
                  LINES: 20->1|25->1|26->3|27->4|27->4|27->4|30->7|31->8|31->8|31->8|31->8|32->9|32->9|32->9|33->10|33->10|33->10|34->11|34->11|34->11|35->12|37->14|37->14|37->14|38->15|40->17
                  -- GENERATED --
              */
          