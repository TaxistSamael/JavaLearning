package patterns.self_implemented.factory.factory_method.model.transparent

import patterns.self_implemented.factory.simple_factory.model.Dildach

class GiantNiggaTransparentDildach : Dildach {

    override fun createForm() {
        println("create nigga dildach")
    }

    override fun pourFormWithRubber() {
        println("pout nigga dildach form with transparent material")
    }

    override fun putInColdWater() {
        println("put nigga dildach in cold water")
    }

    override fun paint() {
        println("paint nigga dildach in black with blue veins e.t.c")
    }
}