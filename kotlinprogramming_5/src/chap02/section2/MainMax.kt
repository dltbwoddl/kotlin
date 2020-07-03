package chap02.section2

//기본형: 가공되지 않은 순수한 자료형
//참조형: 동적 공간에 데이터를 둔 다음 이것을 참조하는 자료형
//속도에서는 기본형이 좋다.but 기본형과 참조형 혼합해서 사용하면 문제 발생
// 코틀린에서는 기본형을 사용하지 않는다. 컴파일할 때 자동적으로 됨.
fun main(){
    println("byte min: "+Byte.MIN_VALUE+" MAX"+Byte.MAX_VALUE)
    println("short min: "+Short.MIN_VALUE+" MAX"+Short.MAX_VALUE)
    println("int min: "+Int.MIN_VALUE+" MAX"+Int.MAX_VALUE)
    println("long min: "+Long.MIN_VALUE+" MAX"+Long.MAX_VALUE)
    println("float min: "+Float.MIN_VALUE+" MAX"+Float.MAX_VALUE)
    println("double min: "+Double.MIN_VALUE+" MAX"+Double.MAX_VALUE)
    var num:Double =0.1

    for(x in 0..999){
        num+=0.1
    }
    println(num)
    var str1: String ="hello"
    var str2 = "world"
    var str3 = "hello"
    println("str1 ===str2: ${str1===str2}")
    println("str1 ===str3: ${str1===str3}")
    //같은 값일 경우 자료형은 같은 힙 주소를 참조한다. 같은 값의 경우 메모리를 아낄 수 있다.
}
//long>int(default)>short>byte 다루는 값에 따라 적당한 메모리 사용. 나머지는 선언할 때 명시해야 사용가능.
// 긴코딩 _으로 읽기 쉽게 구분가능.

//실수 자료형ㅡ double<float
//논리 자료형은 boolean, 문자 자료형은 char
//문자열은 string은 string pool이라는 공간에 구성(힙안에 있다.)
