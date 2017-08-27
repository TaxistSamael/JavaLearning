package patterns.self_implemented.factory.factory_method

import patterns.self_implemented.factory.simple_factory.model.DildachType.*

class DildachFactoryMethodMain {

    companion object {
        private var dildachFactory : AbstractDildachPreparator? = null

        @JvmStatic fun main(args: Array<String>) {
            dildachFactory = RubberDildachFactory()
            dildachFactory?.bakeDildach(BEGINNER)
            println("\n")
            dildachFactory = TransparentDildachFactory()
            dildachFactory?.bakeDildach(BEGINNER)
        }
    }
}