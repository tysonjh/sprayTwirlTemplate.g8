resolvers += Classpaths.sbtPluginSnapshots

addSbtPlugin("io.spray" % "sbt-revolver" % "$g8_sbt_revolver_version$")

addSbtPlugin("io.spray" % "sbt-twirl" % "$g8_sbt_twirl_version$")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "$g8_assembly_version$")