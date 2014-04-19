name := "whisk-text-preprocessing"

organization := "whisk"

scalaVersion := "2.10.4"

scalariformSettings

resolvers += "typesafe" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.3.11" % "test"
)
