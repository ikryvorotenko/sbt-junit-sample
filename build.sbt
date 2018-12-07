import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.7",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Scala Seed Project",
    libraryDependencies ++= Seq(
      scalaTest % Test,
      "com.novocode" % "junit-interface" % "0.11" % Test,
      "junit" % "junit" % "4.12" % Test,
    )
  )
