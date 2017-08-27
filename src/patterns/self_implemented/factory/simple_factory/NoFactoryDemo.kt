package patterns.self_implemented.factory.simple_factory

import patterns.self_implemented.factory.simple_factory.model.GiantNiggaDildach
import patterns.self_implemented.factory.simple_factory.model.SmallChineseDildach

class NoFactoryDemo {

    class SimpleDildachMain {
        companion object {
            @JvmStatic fun main(args: Array<String>) {
                val niggaDildo = GiantNiggaDildach()
                niggaDildo.createForm()
                niggaDildo.pourFormWithRubber()
                niggaDildo.putInColdWater() //why it's material color???

                val chineseDildo = SmallChineseDildach()
                chineseDildo.createForm()
                chineseDildo.pourFormWithRubber()
                chineseDildo.paint() //what if I put paint on hot dildach???
                chineseDildo.putInColdWater()
            }
        }
    }
}
