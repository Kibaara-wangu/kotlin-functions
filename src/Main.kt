
fun main(){
  var isNumber=isPrime(24)
    println(isNumber)

  var isAverage=calculateAverage(34,23)
    println(isAverage)

  var leapYear=year(2024)
    println(leapYear)

  var numbers = listOf(20,10,15)
  var maxNumber = findMaxNumber(numbers)
  println("This is the maximum number : $maxNumber")

    var add = numbers(7,4)
    println(add)

    var sum = addition(2,3,4,5)
    println(sum)

    var myself=feeling("I am Jane and i like playing VolleyBall")
    println(myself)

    statement("Ada") 





}
//Positive or Negative: Write a Kotlin function that takes an integer as a parameter and prints "Positive"
// if the number is greater than 0, "Negative" if it's less than 0, and "Zero" if it's equal to 0.
fun isPrime(x:Int):Boolean{
    if (x>=1)
        return true
    else
        return false


}
//Even or Odd: Create a Kotlin function that accepts an integer as an argument and returns true if the number is even
// and false if it's odd. Print the result.
fun calculateAverage(x:Int,y:Int):Int{
    var number=x+y
    var average=number/2
    return average
}
//Maximum of Three Numbers: Write a Kotlin function that takes three numbers as parameters and returns the
// maximum of the three. Print the result.
fun findMaxNumber(numbers:List<Int>):Int{
    var maxNumber = numbers[0]
    for(number in numbers){
        if(number > maxNumber){
            maxNumber = number
        }
    }
    return maxNumber
}





//Leap Year: Create a Kotlin function that takes a year as a parameter and returns true if it's
// a leap year and false otherwise. Print the result.
fun year(x:Int):Boolean{
    if (x % 4 == 0)
        return true
    else{
        return false
    }
}

//Create and invoke a function that takes in a name and prints out “Hello ${name}” e.g given “Ada” it will print out “Hello Ada”
fun statement(x:String){
    var name = "hello ${x}"
    println(name)
}

//Create and invoke a function that given 2 numbers returns the remainder of their division
fun numbers(a:Int,b:Int): Int{
    return a % b
}
//Create and invoke  function that returns the sum of any given 4 numbers
fun addition(a:Int,b:Int,c:Int,d:Int):Int{
    return a + b + c + d
}

//Create and invoke a function that prints out an interesting fact about yourself
fun feeling(fact:String){
    println(fact)
}


