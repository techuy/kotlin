fun main()
{
    //26 May
    println("Hello World from")
    add()
    sub(200,300)
    var result = mul()
    println("mul = $result")

    var res = div(1000,10)
    println("div = $res")
}

fun div(a:Int,b:Int):Int
{
    return a/b
}
fun mul():Int
{
    var a= 30
    var b=50
    return a*b
}

fun sub(x:Int,y:Int)
{
    var res = x-y
    println("sub = $res")
}
fun add()
{
    var a = 10
    var b = 20
    var c = a+b
    println("sum = $c")
}