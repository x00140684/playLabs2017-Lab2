
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/HelloWorld/conf/routes
// @DATE:Thu Nov 09 12:11:14 GMT 2017


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
