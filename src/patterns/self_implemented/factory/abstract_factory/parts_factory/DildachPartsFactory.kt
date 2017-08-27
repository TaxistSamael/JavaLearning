package patterns.self_implemented.factory.abstract_factory.parts_factory

import patterns.self_implemented.factory.abstract_factory.model.parts.Engine
import patterns.self_implemented.factory.abstract_factory.model.parts.Material

interface DildachPartsFactory {
    fun getEngine() : Engine
    fun getMateial() : Material
}