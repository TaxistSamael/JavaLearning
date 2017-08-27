package patterns.self_implemented.factory.simple_factory

import patterns.self_implemented.factory.simple_factory.model.DildachType.*

class SimpleDildachMain {

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SimpleDildachFactory().bakeDildach(GIANT_NIGGA)
        }
    }
}