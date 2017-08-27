package patterns.self_implemented.factory.simple_factory.model

class BeginnersTransparentDildach : Dildach{

    override fun createForm() {
        println("create beginner's dildach")
    }

    override fun pourFormWithRubber() {
        println("pout beginner's dildach form with transparent silicon")
    }

    override fun putInColdWater() {
        println("put beginner's dildach in cold water")
    }

    override fun paint() {
        println("paint beginner's dildach natural color")
    }
}