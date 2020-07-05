import com.example.edu.person as user


fun main(){
    println("hello kotlin!")
    val exercise = com.example.edu.exercise()
    val persons = user(name = "lim", age = 20)
    val sumfunction = chap03.section1.sum(a = 13, b = 15)
    val person2 = person(no= 123,name = "lim",jobtitle = "programmer")
    println(sumfunction)
    println(exercise)
    println(persons)
    println(persons.name)
    println(persons.age)
}

class person(val no:Int, val name: String ,val jobtitle: String)
