fun main(args: Array<String>) {
    println(args[0])
    println(args[1])
    println(args[2])
}
//args 집어넣기. by edit configuration
//동적 메모리 영역
//프로그램의 일반적인 메모리 영역
//프로그램 실행-)메모리(주)-)jvm-)-)
//메모리 영역
//코드 영역--명령어,ex)fun.....
//데이터 영역--고정된 변수들(초기화된),읽기쓰기 가능한 변수
//읽기 전용 변수
//--------비결정된 영역------------
//동적 할당 영역--객체-)gc가 객체 해제함.
//임시 할당 영역--{}안에 있는 임시 변수들.