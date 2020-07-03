package chap02.section3

fun main(){
    val a:Int =128
    val b=a

    println(a===b)
    val c:Int? =a
    val d:Int? =a
    val e:Int? =c
    println(c==d)//같은 내용만 비교하는 경우
    println(c===d)//같은 내용이지만 다른 객체 주소이므로 false
    println(c===e)//내용 및 주소 모두 같음
    //int?과 int는 완전 다른 자료형이다.
    println(c===a)//
    println(b===a)//
    println(d===a)//
    println(e===a)//
    //비교할 때 내용과 객체주소 중 어떤 것을 비교하는 것인지 확실히 알기.

}