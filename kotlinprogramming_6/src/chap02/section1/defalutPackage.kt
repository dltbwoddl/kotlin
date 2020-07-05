package chap02.section1

import java.lang.Math.PI
import java.lang.Math.abs

//Strin, Int 임포트 사용없이 사용할 수 있는 이유는 표준 라이브러리에 있기 때문이다.
//ctrl+b같이 누르면 기본 패키지로 갈 수 있고 해당 클래스에서 사용할 수 있는 함수를 볼 수 있다.
fun main(){
    val intro: String = "안녕하세요"
    val num:Int=20
    val inindex= intro.get(1)
    println(inindex)
    println("intro $intro, num:$num")
    //특정패키지의 요소를 사용할 때는 alt+enter한뒤 임포트 하면된다.
    println(PI)
    println(abs(-12))
    //만약 한 패키지의 많은 부분을 사용할 경우 import kotlin.math.*를 사용해 패키지 전체를 불러오는 것이 효율적일 수 있다.
}

//Error:(24, 5) Kotlin: Expecting member declaration
//class person(val intro1: String,  val num1:Int){
//    val intro1: String = "안녕하세요"
//    val num1:Int=20
//    val inindex1= intro.get(1)
//    println(inindex1)
//    println("intro $intro1, num:$num1")
//    println(PI)
//    println(abs(-12))
//}
//fun main(){
//    person(intro = "요한", num = 24)
//    print()
//}