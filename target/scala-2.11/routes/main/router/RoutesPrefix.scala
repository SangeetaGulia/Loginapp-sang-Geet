
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/knodus/sangeeta/Git/Loginapp-sang-Geet/conf/routes
// @DATE:Tue Mar 29 16:31:59 IST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
