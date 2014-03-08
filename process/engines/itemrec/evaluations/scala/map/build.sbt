import xerial.sbt.Pack._

name := "predictionio-process-itemrec-metrics-scala-map"

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.1.1",
  "ch.qos.logback" % "logback-core" % "1.1.1",
  "com.github.scopt" %% "scopt" % "3.2.0",
  "org.clapper" %% "grizzled-slf4j" % "1.0.1",
  "org.json4s" %% "json4s-native" % "3.2.7",
  "org.json4s" %% "json4s-ext" % "3.2.7",
  "org.specs2" %% "specs2" % "2.3.10" % "test")

packSettings

packJarNameConvention := "full"

packExpandedClasspath := true

packGenerateWindowsBatFile := false

packMain := Map("mapatk" -> "io.prediction.metrics.itemrec.map.MAPAtK")

packJvmOpts := Map("mapatk" -> Common.packCommonJvmOpts)
