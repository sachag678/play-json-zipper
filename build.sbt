organization := "com.productfoundry"

name    := "play-json-zipper"

version := "1.4"

resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
)

scalaVersion := "2.11.8"

crossScalaVersions := Seq("2.10.4", "2.11.8")

libraryDependencies ++= Seq(
  "com.typesafe.play"   %% "play-json"  % "2.5.3"  % "provided",
  "org.specs2"          %% "specs2"     % "2.3.12" % "test",
  "junit"                % "junit"      % "4.8"    % "test"
)

publishMavenStyle := true

licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

bintrayOrganization := Some("productfoundry")
