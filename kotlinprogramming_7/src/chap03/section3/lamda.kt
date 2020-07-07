package chap03.section3

import java.util.concurrent.locks.ReentrantLock

//람다식의 활용
//동기화
//변경이 일어나면 안되는 특정 코드를 보호하기 위한 잠금 기법
var sharable=1
fun main(){
    val relock=ReentrantLock()

    lock(relock,{criticalfunc()})
    println(2)
    lock(relock){criticalfunc()}
    println(3)
    lock(relock,::criticalfunc)
    println(sharable)
}
fun <T> lock(relock:ReentrantLock,body:()->T):T{
    relock.lock()
    try {
        return body()
    }finally {
        println(1)
        relock.unlock()
    }

}
fun criticalfunc(){
    sharable+=1
}//임계영역

//네트워크 호출 구현하기
//람다식으로 훨씬 간단하게 표현할 수 있다.