package patterns.self_implemented.factory.abstract_factory.model.products

import patterns.self_implemented.factory.abstract_factory.model.parts.Engine
import patterns.self_implemented.factory.abstract_factory.model.parts.Material
import patterns.self_implemented.factory.abstract_factory.parts_factory.DildachPartsFactory
import patterns.self_implemented.factory.abstract_factory.parts_factory.WhiteMarketDildachPartsFactory

class ChineseDildach(val partsFactory: DildachPartsFactory) : AbstractDildach() {

    override fun prepareParts(){
        println("Prepare ${partsFactory.getEngine()} and ${partsFactory.getMateial()}")
    }
}
