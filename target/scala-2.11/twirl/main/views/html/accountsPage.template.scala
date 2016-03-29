
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object accountsPage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class accountsPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Flash,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(email:String)(implicit flash:Flash,message:Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.55*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("accountsPage")/*4.22*/{_display_(Seq[Any](format.raw/*4.23*/("""


"""),format.raw/*7.1*/("""<h1> Account Information </h1>
<p>
    <h1> Welcome """),_display_(/*9.19*/email),format.raw/*9.24*/(""" """),format.raw/*9.25*/("""!</h1>
</p>


<BR/><BR/>
<h1><a href=""""),_display_(/*14.15*/routes/*14.21*/.AccountController.logout),format.raw/*14.46*/(""""> LOGOUT </a></h1>
""")))}))
      }
    }
  }

  def render(email:String,flash:Flash,message:Messages): play.twirl.api.HtmlFormat.Appendable = apply(email)(flash,message)

  def f:((String) => (Flash,Messages) => play.twirl.api.HtmlFormat.Appendable) = (email) => (flash,message) => apply(email)(flash,message)

  def ref: this.type = this

}


}

/**/
object accountsPage extends accountsPage_Scope0.accountsPage
              /*
                  -- GENERATED --
                  DATE: Tue Mar 29 16:42:58 IST 2016
                  SOURCE: /home/knoldus/gitPractice/Loginapp-sang-Geet/app/views/accountsPage.scala.html
                  HASH: 2aa6722b5b91aff990fecd0e07e4bc4edf7e7fae
                  MATRIX: 556->1|719->54|746->72|773->74|801->94|839->95|868->98|947->151|972->156|1000->157|1066->196|1081->202|1127->227
                  LINES: 20->1|25->1|26->3|27->4|27->4|27->4|30->7|32->9|32->9|32->9|37->14|37->14|37->14
                  -- GENERATED --
              */
          