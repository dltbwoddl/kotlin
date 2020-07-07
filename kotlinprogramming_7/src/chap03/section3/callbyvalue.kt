package chap03.section3

fun main(){
    val result = callbyvalue(lamda())//
    println(result)
}
fun callbyvalue(b:Boolean): Boolean{
    println("callbyvalue")
    return b
}
val lamda:()->Boolean={
    println("lamda")
    true
}