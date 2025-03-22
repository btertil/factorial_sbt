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

### Run Jar/App:
* run jar:    `java -jar target/scala-2.13/factorial_sbt-assembly-1.1.0.jar <param>`
* run app:    `target/universal/factorial_sbt-1.1.0/bin/factorial_sbt <param>` (please unzip app first)
* run docker: `docker run factorial_sbt:1.1.0 <param>` 

### Requirements
* [Java JDK](https://www.oracle.com/java/technologies/downloads/)
* [SBT](https://www.scala-sbt.org/)
* [Docker](https://www.docker.com/) optionally