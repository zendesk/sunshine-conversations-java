lazy val root = (project in file(".")).
  settings(
    organization := "com.zendesk",
    name := "sunshine-conversations-client",
    version := "13.0.0",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "io.swagger" % "swagger-annotations" % "1.5.22" % "compile",
      "org.jboss.resteasy" % "resteasy-client" % "6.2.4.Final" % "compile",
      "org.jboss.resteasy" % "resteasy-multipart-provider" % "6.2.4.Final" % "compile",
      "org.jboss.resteasy" % "resteasy-jackson2-provider" % "6.2.4.Final" % "compile",
      "com.fasterxml.jackson.core" % "jackson-core" % "2.14.3" % "compile",
      "com.fasterxml.jackson.core" % "jackson-annotations" % "2.14.3" % "compile",
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.14.3" % "compile",
      "com.github.joschi.jackson" % "jackson-datatype-threetenbp" % "2.15.2" % "compile",
      "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % "2.14.3" % "compile",
      "junit" % "junit" % "5.9.2" % "test",
      "net.aichler" % "jupiter-interface" % "0.11.1" % "test"
    )
  )
