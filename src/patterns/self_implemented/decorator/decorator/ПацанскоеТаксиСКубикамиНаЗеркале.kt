package patterns.self_implemented.decorator.decorator

import patterns.self_implemented.decorator.model.Taxi


/** Пацанский декоратор */
class ПацанскоеТаксиСКубикамиНаЗеркале(
        override var description: String,
        override var cost: Int) : Taxi(){

    constructor(taxi: Taxi) : this(taxi.description, taxi.cost) {
        description = "${taxi.description} с кубиками на зеркале"
        cost = taxi.cost + 5
    }
}