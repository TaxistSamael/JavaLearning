package patterns.self_implemented.factory.abstract_factory

import patterns.self_implemented.factory.abstract_factory.model.products.ChineseDildach
import patterns.self_implemented.factory.abstract_factory.model.products.NiggaDildach
import patterns.self_implemented.factory.abstract_factory.parts_factory.BlackMarketDildachPartsFactory
import patterns.self_implemented.factory.simple_factory.NoSuchDildoException
import patterns.self_implemented.factory.simple_factory.model.Dildach
import patterns.self_implemented.factory.simple_factory.model.DildachType


class BlackMarketStore : DildachStore(){

    override fun  createDildach(dildachType: DildachType): Dildach {
        val partsFactory = BlackMarketDildachPartsFactory()

        return when(dildachType) {
            DildachType.GIANT_NIGGA -> NiggaDildach(partsFactory).newInstance()
            DildachType.SMALL_CHINESE -> ChineseDildach(partsFactory).newInstance()
            else -> throw NoSuchDildoException("Currently we have no dildo, ser")
        }
    }
}