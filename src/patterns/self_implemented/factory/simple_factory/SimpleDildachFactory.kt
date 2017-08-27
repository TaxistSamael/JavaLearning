package patterns.self_implemented.factory.simple_factory

import patterns.self_implemented.factory.simple_factory.model.*
import patterns.self_implemented.factory.simple_factory.model.DildachType.*

class SimpleDildachFactory {

    fun bakeDildach(dildachType: DildachType) : Dildach {
        val dildach = when(dildachType) {
            BEGINNER -> BeginnersDildach()
            GIANT_NIGGA -> GiantNiggaDildach()
            SMALL_CHINESE -> SmallChineseDildach()
            DEFAULT -> throw NoSuchDildoException("What's going on with this dildo!")
        }

        dildach.createForm()
        dildach.pourFormWithRubber()
        dildach.putInColdWater()
        dildach.paint()

        return dildach
    }
}