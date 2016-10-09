// give the user a nice default project!
lazy val root = project.in(file("."))

name := "$name$"

version := "$version$"

scalaVersion := "$scalaVersion$"

organization := "$organization$"


initialCommands in console := """println("Hello from console")"""
initialCommands in consoleQuick := """println("Hello from consoleQuick")"""


libraryDependencies ++= {
	val scalaLoggingVersion = "$scalaLoggingVersion$"
	Seq(
  		"ch.qos.logback" %  "logback-classic" % "1.1.7",
		"com.typesafe.scala-logging" %% "scala-logging" % scalaLoggingVersion
)
}
