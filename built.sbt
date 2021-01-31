name := "ut-it-assignment-group2-utkarsh"
version := "1.0"
scalaVersion := "2.12.12"


lazy val module1 = project.in(file("module1-for-ques1and2"))
  .settings(
    libraryDependencies += 

    "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test	
)

  lazy val module2 = project.in(file("module2-for-ques3"))
  .settings(
    libraryDependencies ++= Seq(
      "org.mockito" %% "mockito-scala" % "1.5.12" % "test",
    "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test

	)
)


lazy val root = project.in(file(".")).aggregate(module1 , module2)
