
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object logout_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object logout_Scope1 {
import helper._

class logout extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*4.2*/main("logout")/*4.16*/{_display_(Seq[Any](format.raw/*4.17*/("""


"""),format.raw/*7.1*/("""<h1> You are successfully logged out </h1>
<h1><a href=""""),_display_(/*8.15*/routes/*8.21*/.LoginController.loginPage),format.raw/*8.47*/(""""> LOGIN </a></h1>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}
}

/**/
object logout extends logout_Scope0.logout_Scope1.logout
              /*
                  -- GENERATED --
                  DATE: Tue Mar 29 16:42:58 IST 2016
                  SOURCE: /home/knoldus/gitPractice/Loginapp-sang-Geet/app/views/logout.scala.html
                  HASH: abfd3ff5153ee604bd9ddf203c31520c0da622c0
                  MATRIX: 656->20|678->34|716->35|745->38|828->95|842->101|888->127
                  LINES: 28->4|28->4|28->4|31->7|32->8|32->8|32->8
                  -- GENERATED --
              */
          