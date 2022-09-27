organization := "com.github.cb372"
scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  "org.scalatest" %% "scalatest" % "3.2.12" % "test"
)

crossScalaVersions := List("2.12.17", "2.11.12", "2.13.9")
pomExtra :=
  <url>https://github.com/cb372/automagic</url>
  <licenses>
    <license>
      <name>Apache License, Version 2.0</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0.html</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:cb372/automagic.git</url>
    <connection>scm:git:git@github.com:cb372/automagic.git</connection>
  </scm>
  <developers>
    <developer>
      <id>cb372</id>
      <name>Chris Birchall</name>
      <url>https://github.com/cb372</url>
    </developer>
  </developers>
publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (version.value.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}
publishMavenStyle := true
Test / publishArtifact := false
pomIncludeRepository := { _ => false }
releasePublishArtifactsAction := PgpKeys.publishSigned.value
releaseCrossBuild := true
