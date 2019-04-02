resolvers ++= DefaultOptions.resolvers(snapshot = true)

addSbtPlugin("com.typesafe.play" % "play-docs-sbt-plugin" % sys.props.getOrElse("play.version", "2.7.0"))
addSbtPlugin("com.typesafe.play" % "interplay" % sys.props.get("interplay.version").getOrElse("2.0.5"))
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.1.18")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.0")
addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.6.0")
