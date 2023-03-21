fun main(args: Array<String>) {
    println("Enter your Destination")
    var point:Int = readLine()!!.toInt()

    when(point){
        1-> println("Go To First Floor")
        2-> println("Go To Second Floor")
        3-> println("Go To Third Floor")
        4-> println("Go To Fourth Floor")
        5-> println("Go To Fifth Floor")

        else -> println("Not Available After 5th")
    }
}