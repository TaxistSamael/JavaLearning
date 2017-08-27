package patterns.self_implemented.factory.factory_method

import patterns.self_implemented.factory.factory_method.model.transparent.GiantNiggaTransparentDildach
import patterns.self_implemented.factory.simple_factory.NoSuchDildoException
import patterns.self_implemented.factory.simple_factory.model.*
import patterns.self_implemented.factory.simple_factory.model.DildachType.*


class TransparentDildachFactory : AbstractDildachPreparator() {

    override fun chooseDildach(dildachType: DildachType) = when (dildachType) {
        BEGINNER -> BeginnersTransparentDildach()
        GIANT_NIGGA -> GiantNiggaTransparentDildach()
        SMALL_CHINESE -> SmallChineseTransparentDildach()
        DEFAULT -> throw NoSuchDildoException("OPACITY!")
    }
}