package patterns.self_implemented.factory.abstract_factory.parts_factory

import patterns.self_implemented.factory.abstract_factory.model.parts.Engine
import patterns.self_implemented.factory.abstract_factory.model.parts.Material
import patterns.self_implemented.factory.abstract_factory.model.parts.engins.ElectricEngine
import patterns.self_implemented.factory.abstract_factory.model.parts.material.Silicon


class WhiteMarketDildachPartsFactory : DildachPartsFactory {
    override fun getEngine() = ElectricEngine()

    override fun getMateial() = Silicon()
}