//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() {
    var myName=findLength("journalism")
    println(myName)

    println(average(23,14))

    var names=capitalizeEven("jane")
    println(names)


}

//    Write a function named findLength that takes a String parameter and returns its length.
//    However, make the return type nullable, indicating that it may return null if the input String is null.
fun findLength(x:String):Int{
    var myWord= x.length
    return myWord
}
//Write a function named average that takes a variable number of integers as
// itits parameters (varargs) and returns the average of those numbers.

fun average(x:Int,y:Int):Int{
    var name=x + y
    var b=name/2
    return b
}
//Create a Kotlin extension function named capitalizeEven for the String class. This function should capitalize every
// second character in the string. For example, if the input is "kotlin", the output should be "kOtLiN".

fun  capitalizeEven(name:String){
    var myName= name.uppercase()
    println(myName)
}

