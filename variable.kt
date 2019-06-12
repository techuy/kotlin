var gloInt:Int = 0
var gloFloat:Float = 0.0f
var gloStr:String? = "Hello, World"

fun main(a: Array<String>)
{
    var a = "Hello.."
    // a =100 //variable can be reassigned but need to be the same datatype
    a="World"
    a="test"

    val b:Int // val is to initialize const
    b = 200 // can be assign only one time
    println(b)
    // b= 100 // immutable-unchangeable
    getStr(gloStr)
}
fun getStr(s:String?)
{
    println("Welcome $s ${s?.length}")
}