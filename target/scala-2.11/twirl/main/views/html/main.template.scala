
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.versioned("images/favicon.png")),format.raw/*9.104*/("""">
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*10.70*/("""" type="text/javascript"></script>

        <link rel='stylesheet' href='"""),_display_(/*12.39*/routes/*12.45*/.WebJarAssets.at(WebJarAssets.locate("css/bootstrap.min.css"))),format.raw/*12.107*/("""'>
        <script type='text/javascript' src='"""),_display_(/*13.46*/routes/*13.52*/.WebJarAssets.at(WebJarAssets.locate("jquery.min.js"))),format.raw/*13.106*/("""'></script>

    </head>
    <body>

    <!-- ~~~~~~~~~~~~~~~~~ BOOTSTRAP CONTAINER STARTED ~~~~~~~~~~~~~~~~~~~ -->
    <div class="container">
    <header>
        <div class="row">
            <div class="col-md-3">
                <img src=""""),_display_(/*23.28*/routes/*23.34*/.Assets.versioned("images/knoldus-christmas-2015.png")),format.raw/*23.88*/("""" height="100px" width="250px">
            </div>
            <div class="col-md-3 col-md-offset-6">

            </div>
        </div>
    </header>

    <!--    ~~~~~~~~~~~~~~~~~~  NAVBAR STARTED  ~~~~~~~~~~~~~~~  -->
    <div id="navbar">
        <nav class="navbar navbar-default">
            <div class="container-fluid">

                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="#">Services</a></li>
                    <li><a href="#">About Us</a></li>
                    <li><a href="#">Contact Us</a></li>
                </ul>
            </div>
        </nav>
        <!--   ~~~~~~~~~~~~~~~~~  NAVBAR ENDED  ~~~~~~~~~~~~~~~~  -->

    </div>
    <div class="row">
         <div id="imgbar" class="col-md-12">
             <img src=""""),_display_(/*49.25*/routes/*49.31*/.Assets.versioned("images/slider.jpg")),format.raw/*49.69*/("""" height="200px" width="100%">

         </div>
    </div>
<div>
    <div class="row">

            <div class=" col-md-4 col-md-offset-4 " style="text-align:center;">
             """),_display_(/*57.15*/content),format.raw/*57.22*/("""
            """),format.raw/*58.13*/("""</div>
    </div>
</div>
    <div id="footer">
        &copy; 2016 Play-App.
    </div>
</div>

    <!-- ~~~~~~~~~~~~~~~~ BOOTSRAP CONTAINER ENDED ~~~~~~~~~~~~~~~~~~ -->
    </body>


</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue Mar 29 16:32:00 IST 2016
                  SOURCE: /home/knodus/sangeeta/Git/Loginapp-sang-Geet/app/views/main.scala.html
                  HASH: 58c68ce1bdeb03f59cc002fd77eeadacd370a5a1
                  MATRIX: 530->1|655->31|683->33|770->94|795->99|883->161|897->167|959->208|1046->269|1060->275|1120->314|1172->339|1187->345|1249->386|1350->460|1365->466|1449->528|1524->576|1539->582|1615->636|1887->881|1902->887|1977->941|2836->1773|2851->1779|2910->1817|3119->1999|3147->2006|3188->2019
                  LINES: 20->1|25->1|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|36->12|36->12|36->12|37->13|37->13|37->13|47->23|47->23|47->23|73->49|73->49|73->49|81->57|81->57|82->58
                  -- GENERATED --
              */
          