organization := "com.gu"
scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

crossScalaVersions := List("2.11.12","2.12.17", "2.13.8")
libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  "org.scalatest" %% "scalatest" % "3.2.14" % "test"
)

enablePlugins(plugins.JUnitXmlReportPlugin)
Test / testOptions ++= Seq( Tests.Argument("-u", sys.env.getOrElse("SBT_JUNIT_OUTPUT","/tmp")) )

ThisBuild / homepage := Some(url("https://github.com/guardian/automagic"))
ThisBuild / licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.html"))
ThisBuild / developers := List(
  Developer(
    "cb372",
    "Chris Birchall",
    "",
    url("https://github.com/cb372")
  )
)
ThisBuild / versionScheme := Some("semver-spec")

publishMavenStyle := true
Test / publishArtifact := false
pomIncludeRepository := { _ => false }
