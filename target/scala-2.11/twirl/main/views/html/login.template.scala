
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

"""),format.raw/*7.1*/("""<div style="background-image: url("""),_display_(/*7.36*/routes/*7.42*/.Assets.versioned("+images/1.jpg+")),format.raw/*7.77*/(""") ">

    """),_display_(/*9.6*/if(flash.get("error").isDefined)/*9.38*/{_display_(Seq[Any](format.raw/*9.39*/("""
      """),format.raw/*10.7*/("""<div class="alert alert-danger">
    <strong>"""),_display_(/*11.14*/flash/*11.19*/.get("error")),format.raw/*11.32*/("""</strong>
            </div>
""")))}),format.raw/*13.2*/("""

"""),format.raw/*15.1*/("""<h1> Login </h1>
    """),_display_(/*16.6*/helper/*16.12*/.form(action=routes.LoginController.authenticate())/*16.63*/{_display_(Seq[Any](format.raw/*16.64*/("""
    """),_display_(/*17.6*/helper/*17.12*/.inputText(userForm("email"))),format.raw/*17.41*/("""

    """),_display_(/*19.6*/helper/*19.12*/.inputPassword(userForm("password"),'_help->"It should be non-empty")),format.raw/*19.81*/("""
    """),format.raw/*20.5*/("""<input type="submit" value="Login">


""")))}),format.raw/*23.2*/("""

"""),format.raw/*25.1*/("""<a href=""""),_display_(/*25.11*/routes/*25.17*/.SignupController.showSignUpPage),format.raw/*25.49*/(""""> Create New User </a>



</div>
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
                  DATE: Tue Mar 29 17:34:06 IST 2016
                  SOURCE: /home/knodus/sangeeta/Git/Loginapp-sang-Geet/app/views/login.scala.html
                  HASH: 6f6862366e3fa127d1193a2c447a2670e12b9c82
                  MATRIX: 550->1|724->65|751->83|779->86|800->99|838->100|866->102|927->137|941->143|996->178|1032->189|1072->221|1110->222|1144->229|1217->275|1231->280|1265->293|1325->323|1354->325|1402->347|1417->353|1477->404|1516->405|1548->411|1563->417|1613->446|1646->453|1661->459|1751->528|1783->533|1852->572|1881->574|1918->584|1933->590|1986->622
                  LINES: 20->1|25->1|26->3|28->5|28->5|28->5|30->7|30->7|30->7|30->7|32->9|32->9|32->9|33->10|34->11|34->11|34->11|36->13|38->15|39->16|39->16|39->16|39->16|40->17|40->17|40->17|42->19|42->19|42->19|43->20|46->23|48->25|48->25|48->25|48->25
                  -- GENERATED --
              */
          