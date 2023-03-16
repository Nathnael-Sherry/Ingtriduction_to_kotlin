fun main(args: Array<String>) {
    for (i in 1 .. 100) {
        if (i % 5 == 0){
            println(i)
        }else{
            println("$i Not Divisible")
        }
    }
}