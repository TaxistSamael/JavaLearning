package patterns.self_implemented.factory.abstract_factory.parts_factory

import patterns.self_implemented.factory.abstract_factory.model.parts.engins.ICEEngine
import patterns.self_implemented.factory.abstract_factory.model.parts.material.Cauchuck


class BlackMarketDildachPartsFactory : DildachPartsFactory {
    override fun getEngine() = ICEEngine()
    override fun getMateial() = Cauchuck()
}