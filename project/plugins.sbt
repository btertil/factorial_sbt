// This is needed to create distro. Requires .enablePlugins(JavaAppPackaging) in build.sbt add
addSbtPlugin("com.github.sbt" % "sbt-native-packager" % "1.9.4")

// This is needed for sbt assembly in order to create a fat jar. No additional entries buitd.sbt needed
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "1.1.0")