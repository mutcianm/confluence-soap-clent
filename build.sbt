name := "confluence-soap-clent"

organization := "org.jetbrains"

version := "1.0.0"

licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

seq(sbtAxisSettings : _*)

SbtAxisKeys.wsdlFiles <+= baseDirectory(_ / "service.wsdl")

SbtAxisKeys.packageSpace := Some("org.jetbrains")

sources in (Compile,doc) := Seq.empty

publishArtifact in (Compile, packageDoc) := false

publishMavenStyle := false

bintrayOrganization := Some("jetbrains")

bintrayRepository := "confluence-soap-clent"

bintrayVcsUrl := Some("git@github.com:mutcianm/confluence-soap-clent.git")

javacOptions ++= Seq("-target", "1.6", "-source", "1.6")
