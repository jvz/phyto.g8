name := "$name$"
organization := "$organization$"
version := "$version$"

scalaOrganization := "org.typelevel"
scalaVersion := "2.12.2-bin-typelevel-4"
// note that with this, you should use CrossVersion.patch instead of CrossVersion.full

// plankton is not on Maven Central yet
resolvers += Resolver.url("bintray-stew", url("http://dl.bintray.com/stew/plankton"))(Resolver.ivyStylePatterns)

// switch this to "Zoo" instead of "Phyto" to add in Cats syntax as a default Predef
enablePlugins(PhytoPlankton)
