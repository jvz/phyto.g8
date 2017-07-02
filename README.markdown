A [Giter8][g8] template for [Phyto Plankton][p].

Plankton is a project that offers alternative default imports and `Predef` object.
Phyto takes a very small subset of the default Scala imports by excluding deprecated
APIs, using immutable collection classes by default, etc. While the feature to support
this is [still pending][pr] in the Lightbend Scala compiler, the [Typelevel Scala][ts]
compiler supports this already and is enabled in this template.

## Requirements
* Java 8
* Typelevel Scala 2.12.2
* SBT 0.13.13+

## Template license
Written in 2017 by Matt Sicker <boards@gmail.com>.

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
[p]: https://github.com/stew/plankton
[pr]: https://github.com/scala/scala/pull/5350
[ts]: http://typelevel.org/scala/
