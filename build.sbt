ThisBuild / version := "1.1.0"
ThisBuild / scalaVersion := "2.13.13"

lazy val root = (project in file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := "factorial_sbt",
    libraryDependencies ++= Seq(
      "org.scala-lang.modules" %% "scala-parser-combinators" % "2.4.0",
      "org.scalatest" %% "scalatest-funsuite" % "3.2.19" % "test",
      "com.lihaoyi" %% "fansi" % "0.5.0"
    )
)
