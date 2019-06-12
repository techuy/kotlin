fun main(args:Array<String>)
{
    var lita = Student(2,"Muny Lita")
    var leak = Student(1,"Leak",85)
//    leak.assign(01,"Leak",85)

    var rith = Student()
//    lita.assign(02,"Muny Lita",99)
    leak.printDetail()
    lita.printDetail()
    rith.printDetail()

}

class Student
//class Student(id:Int, name:String, age:Int)
{
//    var id:Int = id
//    var name:String = name
//    var age = age
// or we can use init{} to assign to the variaable
    var id:Int =0
    var name:String=""
    var age=0
//init
//{
//    this.id= id
//    this.name= name
//    println("boss has done the job")
//}


//    constructor(id:Int, name:String)
//    {
//        this.id = id
//        this.name = name
//    }
    constructor(id:Int,name:String){
    this.id=id
    this.name=name
}
    constructor(id:Int,name:String,age:Int):this(id,name){
        this.age=age
    }
    constructor():this(123,"rith",88){}

//    fun assign(id:Int,name:String,age:Int)
//    {
//        this.id = id
//        this.name = name
//        this.age = age
//    }
    fun printDetail()
    {
        println("Id: $id, Name ${name}, age $age")
    }
}