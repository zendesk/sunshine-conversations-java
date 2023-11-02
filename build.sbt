lazy val root = (project in file(".")).
  settings(
    organization := "com.zendesk",
    name := "sunshine-conversations-client",
    version := "11.0.0",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "io.swagger" % "swagger-annotations" % "1.5.22" % "compile",
      "org.jboss.resteasy" % "resteasy-client" % "5.0.3.Final" % "compile",
      "org.jboss.resteasy" % "resteasy-multipart-provider" % "5.0.3.Final" % "compile",
      "org.jboss.resteasy" % "resteasy-jackson2-provider" % "5.0.3.Final" % "compile",
      "com.fasterxml.jackson.core" % "jackson-core" % "2.13.2" % "compile",
      "com.fasterxml.jackson.core" % "jackson-annotations" % "2.13.2" % "compile",
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.13.2.2" % "compile",
      "com.github.joschi.jackson" % "jackson-datatype-threetenbp" % "2.12.5" % "compile",
      "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % "2.13.2" % "compile",
      "junit" % "junit" % "4.13" % "test",
      "com.novocode" % "junit-interface" % "0.10" % "test"
    )
  )