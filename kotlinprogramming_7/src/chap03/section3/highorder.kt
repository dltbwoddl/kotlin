package chap03.section3

fun main(){
    val result: Int
    //여러줄일경우 마지막 줄이 반환됨.
    val multi ={x:Int, y:Int ->
        println("x*y")
        x
        x*y
    }
    val multi2:(Int,Int)->Int ={x:Int, y:Int -> x*y}
    //val multi3 ={x, y -> x*y}, error

    val greet:()->Unit={ println("hello")}
    val nl:()->()->Unit ={{ println("20")}}

    result=multi(10,20)
    println(result)
    println(greet)
    greet()
//    nl() 반환값없음
    val test = nl()()
    println(test)
}