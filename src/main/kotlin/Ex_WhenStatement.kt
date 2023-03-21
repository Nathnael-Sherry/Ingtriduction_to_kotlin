fun main(args: Array<String>) {
    println("Enter your USSD option")
    var ussd:Int = readLine()!!.toInt()

    when(ussd){
        0-> println("Sh20=1GB for 1hr")
        1-> println("Data Deals")
        2-> println("Daily Bundles")
        3-> println("Weekly Bundles")
        4-> println("GO MONTHLY")

        else -> println("Not Available")
    }
}