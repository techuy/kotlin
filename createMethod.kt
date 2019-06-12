class SString(name:String,mark:Int)
{
    var name = name
    var mark = mark

    fun concatt(w:SString):SString
    {
        var concat = SString("",0)
        concat.name = "${this.name} ${w.name}"
        concat.mark = this.mark + w.mark
        return concat
    }

    operator fun plus(w:SString):SString
    {
        var newSS = SString("",0)
        newSS.name = "${this.name} ${w.name}"
        return newSS
    }
}

fun main(a:Array<String>)
{
    var Hello = SString("Hello",55)
    var World = SString("World",66)
    var HelloWorld = Hello.concatt(World)
    println(HelloWorld.name)
    var HelloWorldV2 = Hello + World
    println(HelloWorldV2.name )
    println(Hello.concatt(World))
    println(HelloWorld)
}