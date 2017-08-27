package patterns.self_implemented.factory.abstract_factory

import patterns.self_implemented.factory.simple_factory.model.Dildach
import patterns.self_implemented.factory.simple_factory.model.DildachType

abstract class DildachStore {
    fun bakeDildach(dildachType: DildachType): Dildach {
        return createDildach(dildachType)
    }

    protected abstract fun createDildach(dildachType: DildachType): Dildach
}
