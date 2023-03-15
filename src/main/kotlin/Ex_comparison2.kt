fun main(args: Array<String>) {
    println("Enter your marks")
    var marks:Int = readLine()!!.toInt()

    if (marks > 80) {
        print("A")
        print("__Congratulations__")
    }else if (marks >= 70) {
        print("A-")
        print("__Exceed Expectations__")
    } else if (marks >= 60) {
        print("B")
        print("__Good trial__")
    }else if (marks >= 50){
        print("C")
        print("__Pull up your socks__")
    }
    else if (marks >= 40){
        print("D")
        print("__Be Serious__")}
    else {
        print("E")
        print("__revisit your books__")
    }
}