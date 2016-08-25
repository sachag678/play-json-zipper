organization := "com.mandubian"

name    := "play-json-zipper"

version := "1.3"

resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Mandubian repository snapshots" at "https://github.com/mandubian/mandubian-mvn/raw/master/snapshots/",
  "Mandubian repository releases" at "https://github.com/mandubian/mandubian-mvn/raw/master/releases/"
)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe.play"   %% "play-json"  % "2.5.3"          ,
  "org.specs2"          %% "specs2"     % "2.3.12" % "test",
  "junit"                % "junit"      % "4.8"    % "test"
)

publishMavenStyle := true

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

bintrayPackageLabels := Seq("play-json", "zipper", "monad", "functional programming", "scala")
