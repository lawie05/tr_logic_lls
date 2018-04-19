
name := "tr_logic_lls"

includeFilter in (Assets, LessKeys.less) := "*.less"
excludeFilter in (Assets, LessKeys.less) := "_*.less"
 
version := "1.0" 
      
lazy val `tr_logic_lls` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
      
scalaVersion := "2.12.2"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice,
  //web jars
  "org.webjars" %% "webjars-play" % "2.6.1",
  "org.webjars" % "jquery" % "1.11.3",
  "org.webjars" % "knockout" % "3.3.0",
  "org.webjars" % "requirejs" % "2.2.0",
  "org.webjars" % "bootstrap" % "3.3.4",
  "org.webjars" % "momentjs" % "2.8.1"
)

unmanagedResourceDirectories in Test +=  (baseDirectory.value  / "target/web/public/test")

      