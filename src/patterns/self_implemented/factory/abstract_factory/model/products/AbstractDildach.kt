package patterns.self_implemented.factory.abstract_factory.model.products

import patterns.self_implemented.factory.simple_factory.model.Dildach

abstract class AbstractDildach : Dildach {

    fun newInstance(): AbstractDildach {
        prepareParts()
        createForm()
        pourFormWithRubber()
        putInColdWater()
        paint()
        return this
    }

    override fun createForm() {
        println("create form")
    }

    override fun pourFormWithRubber() {
        println("pour with rubber")
    }

    override fun putInColdWater() {
        println("put in cold water")
    }

    override fun paint() {
        println("paint dildach")
    }

    protected abstract fun prepareParts()
}