fun main(args: Array<String>) {
    print("Enter your code")
    var number:Int = readLine()!!.toInt()

    if (number < 1) {
        print("1.5GB for 3hours @Ksh50")
    }else if (number == 1) {
        print("Amazing + Bazu Data")
    } else if (number == 2) {
        print("Tubonge + ALLNET")
    }else if (number == 3){
        print("UnlimiNET Combo")}
    else{
        print("Invalid Character")
    }
}