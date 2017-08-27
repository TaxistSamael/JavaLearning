package patterns.self_implemented.factory.abstract_factory.model.products

import patterns.self_implemented.factory.abstract_factory.parts_factory.DildachPartsFactory

class NiggaDildach(val partsFactory: DildachPartsFactory) : AbstractDildach() {

    override fun prepareParts() {
        println("Prepare ${partsFactory.getEngine()} and ${partsFactory.getMateial()}")
    }
}