organization := "com.mandubian"

name    := "play-json-zipper"

version := "1.7"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe.play"   %% "play-json"  % "2.6.6"          ,
  "org.specs2"          %% "specs2"     % "2.3.12" % "test",
  "junit"                % "junit"      % "4.8"    % "test"
)

publishTo := Some(Resolver.file("file", new File("../mvn-repo")))

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

//bintrayPackageLabels := Seq("play-json", "zipper", "monad", "functional programming", "scala")
