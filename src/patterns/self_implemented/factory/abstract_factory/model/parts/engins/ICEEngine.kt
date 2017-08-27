package patterns.self_implemented.factory.abstract_factory.model.parts.engins

import patterns.self_implemented.factory.abstract_factory.model.parts.Engine


class ICEEngine : Engine {
    override fun getEngine() {
        print("ICE engine")
    }
}