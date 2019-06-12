open class Student1(id:Int,name:String)
{
    var id = id
    var name = name
    open fun print()
    {
        println("i am a student")
    }
}

class Visal(id:Int,name:String):Student1(id,name)
{
    fun who()
    {
        println("i am Visal, bros louk klun")
    }
    override fun print()
    {
        println("anh louk klun ters ey heang rerng nh")
        super.print()
    }
}

class Uy(id:Int,name:String):Student1(id,name)
{
    fun who()
    {
        println("he who must not be name")
    }
}

fun main()
{
    var salV = Visal(1,"V")
    var Uy = Uy(15,"Uy")
    salV.who()
    salV.print()
    println("${salV.name}")
    Uy.who()
    println("${Uy.name}")
    Uy.print()
}