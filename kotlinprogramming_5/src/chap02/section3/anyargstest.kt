package chap02.section3

fun main(){
    checkArg(x="hello")
    checkArg(x=5)
}
fun checkArg(x:Any){
    if(x is String){
        println("x is string: $x")
    }
    if(x is Int){
        println("x is Int: $x")
    }
}
//x is string: hello
//x is Int: 5