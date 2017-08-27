package patterns.self_implemented.factory.abstract_factory.model.parts.material

import patterns.self_implemented.factory.abstract_factory.model.parts.Material

class Cauchuck : Material {
    override fun getMaterial() {
        print("Cauchuck material")
    }
}