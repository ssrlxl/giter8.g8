// give the user a nice default project!


initialCommands in console := """println("Hello from console")"""
initialCommands in consoleQuick := """println("Hello from consoleQuick")"""

libraryDependencies ++= Seq("ch.qos.logback" %  "logback-classic" % "1.1.7",
							"com.typesafe.scala-logging" %% "scala-logging" % "3.5.0")