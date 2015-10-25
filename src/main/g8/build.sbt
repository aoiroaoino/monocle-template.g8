import sbt._

name := "$name$"

scalaVersion := "$scala_version$"

licenses := Seq("MIT License" -> url("http://opensource.org/licenses/mit"))

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-Xlint",
  "-Ywarn-dead-code",
  "-language:higherKinds",
  "-language:postfixOps",
  "-language:implicitConversions"
)

resolvers += Resolver.sonatypeRepo("releases")
resolvers += Resolver.sonatypeRepo("snapshots")

val libraryVersion = "$monocle_version$"

libraryDependencies ++= Seq(
  "com.github.julien-truffaut"  %%  "monocle-core"    % libraryVersion,
  "com.github.julien-truffaut"  %%  "monocle-generic" % libraryVersion,
  "com.github.julien-truffaut"  %%  "monocle-macro"   % libraryVersion,
  "com.github.julien-truffaut"  %%  "monocle-state"   % libraryVersion,
  "com.github.julien-truffaut"  %%  "monocle-law"     % libraryVersion  % "test"
)

// for @Lenses macro support
addCompilerPlugin("org.scalamacros" %% "paradise" % "2.1.0-M5" cross CrossVersion.full)
