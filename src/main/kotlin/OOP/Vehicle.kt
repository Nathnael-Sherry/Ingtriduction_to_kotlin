package OOP

class Vehicle(owner:String, color:String, wheels:Int, model:String) {
    init {
        println("owned by $owner")
        println("color is $color")
        println("Has $wheels wheels in total")
        println("Model is $model")
    }
}

fun main(args: Array<String>) {
    var owner_1 = Vehicle("Sharon", "Red", 4, "Toyota")
    var owner_2 = Vehicle("Nathnael", "Silver", 4, "Land Rover")
    var owner_3 = Vehicle("Jim", "Blue", 4, "ISUZU")
}