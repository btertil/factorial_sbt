ThisBuild / version := "1.0.0"
ThisBuild / scalaVersion := "2.12.4"

lazy val root = (project in file("."))
  .settings(
    name := "factorial_sbt",
    libraryDependencies ++= Seq(
      "org.scala-lang.modules" %% "scala-parser-combinators" % "2.4.0",
      "org.scalatest" %% "scalatest-funsuite" % "3.2.19",
      "com.lihaoyi" %% "fansi" % "0.5.0"
    )
  )
