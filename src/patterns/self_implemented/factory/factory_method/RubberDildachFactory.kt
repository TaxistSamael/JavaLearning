package patterns.self_implemented.factory.factory_method

import patterns.self_implemented.factory.simple_factory.NoSuchDildoException
import patterns.self_implemented.factory.simple_factory.model.*
import patterns.self_implemented.factory.simple_factory.model.DildachType.*

class RubberDildachFactory : AbstractDildachPreparator(){

    override fun chooseDildach(dildachType: DildachType) = when (dildachType) {
        BEGINNER -> BeginnersDildach()
        GIANT_NIGGA -> GiantNiggaDildach()
        SMALL_CHINESE -> SmallChineseDildach()
        DEFAULT -> throw NoSuchDildoException("АЛЛАХУ АКБАР!")
    }
}