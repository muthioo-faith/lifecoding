fun main(){
num()
    multiplication(5,3)
    multiplication(10,10)
    division(3,2)
    names("faith")
    names("mollen")
   var x= subtraction(24,3)
    println(x)
    output()
    result()
    stringInterpolation()
    stringBoolean()
    stringReplace()
    stringArrays("mollen","faith","Subdio","peter")
    var w=Arrays("moha","sam","benja")
    println(w.contentToString())
   var multiplication= product(arrayOf(2,4,3,2))
    println(multiplication)

  var f= sumAdd(arrayOf(20,3,5,7))
    println(f)
   var g= arrayCharacter(arrayOf('a','A','c','e','i','o','u'))
    println(g)
    stringCase()
}
fun num(){
    var num1=10
    var num2=6
    var num3=3
    var sum=num1+num2+num3
    println(sum)
    output()

}
fun multiplication(num1:Int,num2:Int){
    var product=num1*num2
    println(product)

}
fun division(num1:Int,num2:Int){
    var x=num1%num2
    println(x)

}
fun names(name:String){

    println("hello my name is "+name)
}
fun subtraction(num1:Int,num2:Int):Int{
    var difference=num1-num2
    return difference
}
fun output(){
    var name="my name is "
    var x ="faith"
    println(name+"" +x)

}
fun result(){
    var x="banana"
    println(x[0])
    println(x[2])
    println(x[4])
    println(x[3])
    println(x[4])
    println(x[5])
    println(x[3].toString()+x[4]+x[5])
}
fun stringInterpolation(){
    var name="faith"
    var age=21
    var year=2001
    println("Hi my name is $name i am $age years old and i was born in $year")
}
fun stringBoolean(){
    var mess1="pwqh23yte.confirmed"
    var mess2="pwqh2te.confirmed"
    if(mess1==mess2){
        println(true)
    }
    else{
        println(false)
    }
}
fun stringReplace(){
    var text="Faith is a  Ugandan cabinet secretary of Festive breads"
    println(text.replace("Uganda","Africa"))
}
fun stringArrays(a:String,b:String,c:String,d:String){
    var names= arrayOf(a,b,c,d)
    println(names.contentToString())

}
fun Arrays(e:String,f:String,g:String,):Array<String>{
    var output= arrayOf(e,f,g)
    return output
}
fun product(numbers:Array<Int>):Int {
    var t = 1
    numbers.forEach { num ->
        t *= num
    }
        return t



}
    fun sumAdd(numbers: Array<Int>): Int {
        var s = 0
        numbers.forEach { num ->
            s += num
        }
        return s
    }

    fun arrayCharacter(vowels: Array<Char>): Int {
        var vowel = 0
        vowels.forEach { c ->
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vowel++

        }
        return vowel
    }

fun stringCase(){
    var c= "african inventor"
    println(c.uppercase())
    println(c.lowercase())
    println(c.capitalize())
    println(c.endsWith("r"))
    println(c.startsWith("a"))
    println(c.startsWith("c"))
}



