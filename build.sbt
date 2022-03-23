def Scala3 = "3.1.1"

scalaVersion := Scala3

crossScalaVersions := Seq("2.13.8", Scala3)

scalacOptions ++= {
  if (scalaBinaryVersion.value == "3") {
    Seq("-Ykind-projector")
  } else {
    Nil
  }
}

libraryDependencies ++= {
  if (scalaBinaryVersion.value == "3") {
    Nil
  } else {
    Seq(compilerPlugin("org.typelevel" % "kind-projector" % "0.13.2" cross CrossVersion.full))
  }
}
