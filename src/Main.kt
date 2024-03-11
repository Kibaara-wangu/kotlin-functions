
fun main(){
  var isNumber=isPrime(24)
    println(isNumber)

  var isAverage=calculateAverage(34,23)
    println(isAverage)

var x = isPrime(24)
    println(x)
}
fun isPrime(x:Int):Boolean{
    if (x<=1)
        return false
    else
        return true


}
fun calculateAverage(x:Int,y:Int):Int{
    var number=x+y
    var average=number/2
    return average
}


