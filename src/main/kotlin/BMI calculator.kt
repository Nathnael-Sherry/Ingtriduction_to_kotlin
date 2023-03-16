fun main(args: Array<String>) {
    println("Enter your weight")
    var weight:Int = readLine()!!.toInt()
    println("Enter your height")
    var height:Float = readLine()!!.toFloat()

    var bmi = weight / (height * height)
    print (bmi)
    if (bmi <= 18){
        println("__Underweight")}
    else if (bmi <= 29){
        println("__Normal weight")}
    else if (bmi <= 34){
        println("__Overweight")}
    else {
        println("__Obese")
    }
}