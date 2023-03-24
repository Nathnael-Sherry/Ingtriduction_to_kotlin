package OOP

class House(owner:String, rooms:Int, location:String ) {
    init {
        println("Owned by $owner")
        println("Has $rooms rooms in total")
        println("Located at $location")
    }
}

fun main(args: Array<String>) {
    var owner_one = House("Nathnael", 15, "Karen")
    var owner_two = House("Beatrice", 8, "Westlands")
    var owner_three = House("Jacob", 10, "Kisumu")
    var owner_four = House("Sharon", 12, "Lang'ata")
}