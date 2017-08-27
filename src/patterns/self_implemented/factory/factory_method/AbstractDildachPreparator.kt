package patterns.self_implemented.factory.factory_method

import patterns.self_implemented.factory.simple_factory.NoSuchDildoException
import patterns.self_implemented.factory.simple_factory.model.*

abstract class AbstractDildachPreparator {

    fun bakeDildach(dildachType: DildachType) : Dildach {
        val dildach = chooseDildach(dildachType)

        dildach.createForm()
        dildach.pourFormWithRubber()
        dildach.putInColdWater()
        dildach.paint()

        return dildach
    }

    protected abstract fun chooseDildach(dildachType: DildachType) : Dildach
}
