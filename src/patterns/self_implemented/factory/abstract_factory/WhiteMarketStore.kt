package patterns.self_implemented.factory.abstract_factory

import patterns.self_implemented.factory.abstract_factory.model.products.ChineseDildach
import patterns.self_implemented.factory.abstract_factory.model.products.NiggaDildach
import patterns.self_implemented.factory.abstract_factory.parts_factory.WhiteMarketDildachPartsFactory
import patterns.self_implemented.factory.simple_factory.NoSuchDildoException
import patterns.self_implemented.factory.simple_factory.model.Dildach
import patterns.self_implemented.factory.simple_factory.model.DildachType
import patterns.self_implemented.factory.simple_factory.model.DildachType.*


class WhiteMarketStore : DildachStore() {

    override fun createDildach(dildachType: DildachType): Dildach {
        val partsFactory = WhiteMarketDildachPartsFactory()

        return when (dildachType) {
            GIANT_NIGGA -> NiggaDildach(partsFactory).newInstance()
            SMALL_CHINESE -> ChineseDildach(partsFactory).newInstance()
            else -> throw NoSuchDildoException("Currently we have no dildo, ser")
        }
    }
}