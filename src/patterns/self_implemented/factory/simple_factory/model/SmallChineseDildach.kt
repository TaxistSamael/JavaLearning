package patterns.self_implemented.factory.simple_factory.model


class SmallChineseDildach : Dildach {

    override fun createForm() {
        println("create small chinese dildach")
    }

    override fun pourFormWithRubber() {
        println("pout small chinese dildach form")
    }

    override fun putInColdWater() {
        println("put small chinese dildach in cold water")
    }

    override fun paint() {
        println("paint small chinese dildach in yellow")
    }
}