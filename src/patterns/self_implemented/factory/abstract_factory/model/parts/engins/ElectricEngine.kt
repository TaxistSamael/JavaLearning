package patterns.self_implemented.factory.abstract_factory.model.parts.engins

import patterns.self_implemented.factory.abstract_factory.model.parts.Engine

class ElectricEngine : Engine {

    override fun getEngine() {
        print("Electric engine")
    }
}