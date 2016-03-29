
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knodus/sangeeta/Git/Loginapp-sang-Geet/conf/routes
// @DATE:Tue Mar 29 16:31:59 IST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_4: controllers.Application,
  // @LINE:9
  Assets_1: controllers.Assets,
  // @LINE:10
  WebJarAssets_2: controllers.WebJarAssets,
  // @LINE:12
  SignupController_0: controllers.SignupController,
  // @LINE:13
  LoginController_3: controllers.LoginController,
  // @LINE:17
  AccountController_5: controllers.AccountController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_4: controllers.Application,
    // @LINE:9
    Assets_1: controllers.Assets,
    // @LINE:10
    WebJarAssets_2: controllers.WebJarAssets,
    // @LINE:12
    SignupController_0: controllers.SignupController,
    // @LINE:13
    LoginController_3: controllers.LoginController,
    // @LINE:17
    AccountController_5: controllers.AccountController
  ) = this(errorHandler, Application_4, Assets_1, WebJarAssets_2, SignupController_0, LoginController_3, AccountController_5, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_4, Assets_1, WebJarAssets_2, SignupController_0, LoginController_3, AccountController_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""", """controllers.WebJarAssets.at(file:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.SignupController.createUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.loginPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.authenticate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.SignupController.showSignUpPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.AccountController.showAccountsPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.AccountController.logout"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_4.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_WebJarAssets_at2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at2_invoker = createInvoker(
    WebJarAssets_2.at(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebJarAssets",
      "at",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """webjars/$file<.+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_SignupController_createUser3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_SignupController_createUser3_invoker = createInvoker(
    SignupController_0.createUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignupController",
      "createUser",
      Nil,
      "POST",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_LoginController_loginPage4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_loginPage4_invoker = createInvoker(
    LoginController_3.loginPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginPage",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_LoginController_authenticate5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_authenticate5_invoker = createInvoker(
    LoginController_3.authenticate,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_SignupController_showSignUpPage6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_SignupController_showSignUpPage6_invoker = createInvoker(
    SignupController_0.showSignUpPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignupController",
      "showSignUpPage",
      Nil,
      "GET",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_AccountController_showAccountsPage7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_AccountController_showAccountsPage7_invoker = createInvoker(
    AccountController_5.showAccountsPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AccountController",
      "showAccountsPage",
      Nil,
      "GET",
      """""",
      this.prefix + """home"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_AccountController_logout8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_AccountController_logout8_invoker = createInvoker(
    AccountController_5.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AccountController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_4.index)
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:10
    case controllers_WebJarAssets_at2_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at2_invoker.call(WebJarAssets_2.at(file))
      }
  
    // @LINE:12
    case controllers_SignupController_createUser3_route(params) =>
      call { 
        controllers_SignupController_createUser3_invoker.call(SignupController_0.createUser)
      }
  
    // @LINE:13
    case controllers_LoginController_loginPage4_route(params) =>
      call { 
        controllers_LoginController_loginPage4_invoker.call(LoginController_3.loginPage)
      }
  
    // @LINE:14
    case controllers_LoginController_authenticate5_route(params) =>
      call { 
        controllers_LoginController_authenticate5_invoker.call(LoginController_3.authenticate)
      }
  
    // @LINE:15
    case controllers_SignupController_showSignUpPage6_route(params) =>
      call { 
        controllers_SignupController_showSignUpPage6_invoker.call(SignupController_0.showSignUpPage)
      }
  
    // @LINE:17
    case controllers_AccountController_showAccountsPage7_route(params) =>
      call { 
        controllers_AccountController_showAccountsPage7_invoker.call(AccountController_5.showAccountsPage)
      }
  
    // @LINE:18
    case controllers_AccountController_logout8_route(params) =>
      call { 
        controllers_AccountController_logout8_invoker.call(AccountController_5.logout)
      }
  }
}