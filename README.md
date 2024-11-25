# factorial_sbt

### Descritption
factorial_sbt is a simple factorial implementation in scala to show how to setup sbt config files (plugins, build, dependecies, etc.).<br>

It has unit tests as well as a couple of additional libraries like fansi to demonstrate how dependencies should be configured for sbt.<br>

Tested with cmd line sbt, Intellij and vscode (metals plugin)

### Sbt commands to test/run/compile:
* `sbt compile`: compile scala classes
* `sbt run`: runs scala program
* `sbt test`: runs unit tests (scalatest-funsuite needed)
* `sbt package`: creates thin jar
* `sbt assembly`: creates fat jar (sbt-assembly plugin needed)
* `sbt dist`: creates zipped distro (sbt-native-packager needed + JavaAppPackaging)
* `sbt Docker/publishLocal`: creates dockerized app (sbt-native-packager needed + JavaAppPackaging)