name         := "SevenBees"
version      := "0.2.0"
description  := "A sound piece"
organization := "de.sciss"
homepage     := Some(url(s"https://github.com/Sciss/${name.value}"))
licenses     := Seq("gpl v2+" -> url("http://www.gnu.org/licenses/gpl-2.0.txt"))
scalaVersion := "2.12.4"

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature", "-Xfuture", "-encoding", "utf8", "-Xlint")

libraryDependencies ++= Seq(
  "de.sciss"          %% "negatum"  % "0.4.0",
  "com.github.scopt"  %% "scopt"    % "3.7.0"
)

resolvers += "Oracle Repository" at "http://download.oracle.com/maven"  // required for sleepycat (although not used)
