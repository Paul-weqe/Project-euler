

fun d(number: Int): Int{
    var sumNumber = 0
    for (x in 1..(number/2)){
        if (number % x == 0) sumNumber += x
    }
    return sumNumber
}


var amicableMap = HashMap<Int, Int>()


for (number in 1..10000){
    var result = d(number)
    var y = d(result)
    if (y == number){
        amicableMap.put(number, result)
    }
}

var result: ArrayList<Int> = ArrayList()
var finalSum: Int = 0

for (number in amicableMap){
    result.add(number.key)
    result.add(number.value)
//    if (!result.contains(number.key)) result.add(number.key)
//    if (!result.contains(number.value)) result.add(number.value)
}

for (number in result){
    finalSum += number
}

println(finalSum)


