
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
//Grade Calculation: Write a Kotlin function that takes a student's score as a parameter and returns the corresponding grade based on the following criteria:
//90 or above: "A"
//80-89: "B"
//70-79: "C"
//60-69: "D"
//Below 60: "F" Print the grade.




