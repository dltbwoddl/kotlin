package chap02.section3
//자료형 변환
//서로다른 자료형은 변환 과정을 거친 후 비교
//변환메서드 이용해서
//표현식에서는 자료형의 자동 변환 발생
fun main(){
    val f:Int=128
    val r:Int=128
    println(f==r)
    println(f===r)
    //컴파일 후 기본형으로 바뀌어 스택에 들어가므로 주소가
    //동일한 것과 같은 true가 반환된다.
    val a:Int =128
    val b=a

    println(a===b)
    val c:Int? =a
    val d:Int? =a
    val e:Int? =c
    println(c==d)//같은 내용만 비교하는 경우
    println(c===d)//같은 내용이지만 다른 객체 주소(참조주소)이므로 false
    println(c===e)//내용 및 주소 모두 같음
    //int?과 int는 완전 다른 자료형이다.
    println(c===a)//
    println(b===a)//
    println(d===a)//
    println(e===a)//
    //비교할 때 내용과 객체주소 중 어떤 것을 비교하는 것인지 확실히 알기.

    //코들린에서는 참조형으로 선언한 변수의 값이 -128 ~127 이면 캐시에 그 값을 저장한다.
    //캐시:캐시(cache, 문화어: 캐쉬, 고속완충기, 고속완충기억기)는 컴퓨터 과학에서 데이터나 값을 미리 복사해 놓는 임시 장소를 가리킨다
//캐시는 캐시의 접근 시간에 비해 원래 데이터를 접근하는 시간이 오래 걸리는 경우나 값을 다시 계산하는 시간을 절약하고 싶은 경우에 사용한다.
    println("('//////')")
    val x:Int =127
    val y=x

    println(x===y)
    val z:Int? =x
    val o:Int? =x
    val p:Int? =z
    println(z==o)//같은 내용만 비교하는 경우
    println(z===o)//같은 내용이지만 다른 객체 주소(참조주소)이므로 false
    println(z===p)//내용 및 주소 모두 같음
}