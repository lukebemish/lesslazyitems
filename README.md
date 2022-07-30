# Less Lazy Items

## Overview

Allows items to be animated with a "Wand of Animation", after which they will walk around. Items can be lead with leads
to allow for easy transportation. Items will normally turn back into their un-animated form after a few minutes or when
taking damage; this time can be extended indefinitely using a "Wand of Continuous Animation", though items will still
revert upon taking damage. Items will attempt to walk towards "pickup" blocks (anything in the `lesslazyitems:collectors`
block tag), and certain items, such as shulkers or any modded items providing an item transfer capability, will attempt to
pick up other items, animated or otherwise. Both wands work in dispensers; recipes can be found with JEI or the like.

*Note: possibly due to [MC-245865](https://bugs.mojang.com/browse/MC-245865), pathfinding for items can be a bit buggy.
Bump hoppers one block up or down from surrounding ground to avoid this weirdness.*

## Building

_Less Lazy Items_ is written in JASM bytecode mnemonics. IDE support may be sketchy, to say the least. The gradle setup
should allow for as much IDE support as possible on IntelliJ if the appropriate plugin is installed; I have not tested
much with Eclipse or other IDEs. The mod builds through gradle; it should still build correctly even if some files are
filled with apparent errors.

*Note: from what testing I have done, this project will __not__ run correctly through eclipse. If you are using eclipse,
you may need to run either by running the runClient gradle task or through the command line. I have not been able to
find any easy way around this; you are best off running the proper gradle tasks directly.*
