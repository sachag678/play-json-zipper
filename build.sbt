scalaVersion in ThisBuild := "2.11.12"

crossScalaVersions in ThisBuild := Seq("2.11.12", "2.12.6")

lazy val root = project.in(file(".")).
  aggregate(sharedJS, sharedJVM).
  settings(
    publish := {},
    publishLocal := {}
  )

lazy val shared = crossProject.in(file(".")).
  settings(
    organization := "com.mandubian",
    name    := "play-json-zipper",
    version := "1.8",
    libraryDependencies ++= Seq(
      "com.typesafe.play"   %%% "play-json"    % "2.6.6"          ,
      "org.specs2"          %%% "specs2-core"  % "4.2.0" % "test"
    ),
    licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0")),
    publishTo := Some(Resolver.file("file", new File("../mvn-repo")))
  ).
  jvmSettings(
    // Add JVM-specific settings here
  ).
  jsSettings(
    // Add JS-specific settings here
  )

lazy val sharedJVM = shared.jvm
lazy val sharedJS = shared.js

//bintrayPackageLabels := Seq("play-json", "zipper", "monad", "functional programming", "scala")
