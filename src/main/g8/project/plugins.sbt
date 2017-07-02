resolvers += Resolver.url("bintray-stew", url("http://dl.bintray.com/stew/plankton"))(Resolver.ivyStylePatterns)

addSbtPlugin("io.github.stew" % "sbt-plankton" % "$planktonVersion$")
