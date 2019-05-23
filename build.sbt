import sbt.Keys.updateOptions
import sbt._

lazy val commonSettings = Seq(
	name := "slinky-bootstrap",
  version := "1.0",
  scalaVersion := "2.12.8",
  organization := "com.harana",
	target := file(baseDirectory.value + "/../target") / name.value,
  resolvers ++= Seq(Resolver.sonatypeRepo("releases"),
	                  Resolver.sonatypeRepo("snapshots"),
										"Typed" at "https://dl.bintray.com/oyvindberg/ScalablyTyped"),
  updateOptions := updateOptions.value.withCachedResolution(true),
	addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full),
	javacOptions ++= Seq(),
	//scalacOptions ++= Seq("-Ymacro-debug-lite")
)

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

lazy val js = (project in file("js"))
  .settings(
	commonSettings,
		scalaJSUseMainModuleInitializer := true,
	  jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv(),
		requireJsDomEnv in Test := true,
		skip in packageJSDependencies := false,
    emitSourceMaps := false,
		useYarn := true,
		addCommandAlias("start", ";compile;fastOptJS::startWebpackDevServer;~fastOptJS"),
		addCommandAlias("stop", "fastOptJS::stopWebpackDevServer"),
		version in webpack := "4.29.6",
		version in startWebpackDevServer := "3.1.4",
		scalaJSOptimizerOptions in fastOptJS ~= { _.withDisableOptimizer(true) },
	  scalacOptions += "-P:scalajs:sjsDefinedByDefault",
		webpackDevServerExtraArgs in fastOptJS := Seq("--inline", "--hot"),
		webpackBundlingMode in fastOptJS := BundlingMode.LibraryOnly(),
		webpackBundlingMode in fullOptJS := BundlingMode.Application,
	  libraryDependencies ++= Seq(
			"me.shadaj"                               %%%   "slinky-core"               					% "0.6.1",
			"me.shadaj"                               %%%   "slinky-web"               						% "0.6.1",
			"org.scalablytyped"												%%% 	"csstype"						 									% "2.6.3-9dec0a",
			"org.scalablytyped"												%%% 	"react"						 										% "16.8-dt-20190520Z-43357b",
			"org.scalablytyped"												%%% 	"std"						 											% "3.4-d52857"
		),
		dependencyOverrides ++= Seq(
			"org.scala-js" 															% 	"sbt-scalajs" 												% "0.6.27"
		),
	  npmDependencies in Compile ++= Seq(
			"react"                                   -> "16.8.6",
			"react-dom"                               -> "16.8.6",
			"react-bootstrap"													-> "0.32.4",
			"react-bootstrap-typeahead"								-> "3.4.2",
			"react-router-bootstrap"									-> "0.24.4",
			"bootstrap-datepicker"										-> "1.8.0",
			"bootstrap-daterangepicker"								-> "3.0.3"
		),
		npmDevDependencies in Compile ++= Seq(
			"url-loader"                              -> "0.6.2",
			"css-loader"                              -> "0.28.7",
			"html-webpack-plugin"                     -> "3.2.0",
			"copy-webpack-plugin" 										-> "4.5.1",
			"static-site-generator-webpack-plugin" 		-> "3.4.1"
		)
  )
  .enablePlugins(ScalaJSWeb, ScalaJSBundlerPlugin)

onLoad in Global := (onLoad in Global).value andThen {s: State => "project js" :: s}