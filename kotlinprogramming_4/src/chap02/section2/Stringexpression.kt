package chap02.section2
//  문자열 안에서 "을 사용하려면 \"
fun main(){
    var a=1
    val str1 = "a = $a"
    val str2 = "a = ${a+2}"

    println("str1: \"$str1\",str2:\"$str2\"")
    println("str1: $str1 , str2:$str2")
}