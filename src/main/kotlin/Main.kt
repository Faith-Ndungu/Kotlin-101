fun main(){
    val name = "Faith"
    printHello(name)
    var y = modulus(9.0, 4)
    println(y)
    var x = sum(24,29)
    println(x)
    var sentence = "Iam friendly and social"
    println(sentence)


}

fun printHello (name:String){
    println("Hello $name")

}

fun modulus(num1:Double,num2:Int):Double{
    var result = num1%num2
    return result


}

fun sum (num1:Int,num2:Int):Int{
    var result = num1+num2
    return result
}

fun factAboutMe (sentence:String){
    println("sentence")
}