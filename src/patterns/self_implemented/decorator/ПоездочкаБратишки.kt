package patterns.self_implemented.decorator

import patterns.self_implemented.decorator.decorator.ПацанскоеТаксиСКубикамиНаЗеркале
import patterns.self_implemented.decorator.model.PatsanskoeTaxi
import patterns.self_implemented.decorator.model.Taxi

class ПоездочкаБратишки {

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            var taxi: Taxi = PatsanskoeTaxi()
            println("Поездка на ${taxi.description} стоит ${taxi.cost}")

            taxi = ПацанскоеТаксиСКубикамиНаЗеркале(taxi)
            println("Поездка на ${taxi.description} стоит ${taxi.cost}")
        }
    }
}