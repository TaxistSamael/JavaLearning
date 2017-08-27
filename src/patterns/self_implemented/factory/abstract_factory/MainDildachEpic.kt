package patterns.self_implemented.factory.abstract_factory

import patterns.self_implemented.factory.simple_factory.model.DildachType


class MainDildachEpic {

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            val whiteMarket = BlackMarketStore()
            whiteMarket.bakeDildach(DildachType.GIANT_NIGGA)
        }
    }
}