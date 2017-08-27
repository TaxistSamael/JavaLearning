package patterns.self_implemented.decorator.model


class PatsanskoeTaxi(override var description: String = "Пацанское такси", override var cost: Int = 15) : Taxi()