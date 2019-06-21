

fun getDivisors(number: Int): ArrayList<Int>{
    var divisorsArray: ArrayList<Int> = ArrayList()
    for (x in 1..number-1){
        if (number % x == 0)
            divisorsArray.add(x)
    }
    return divisorsArray
}

fun isPerfect(number: Int): Boolean{
    if (getDivisors(number).sum() == number) return true
    return false
}

fun isDeficient(number: Int): Boolean{
    if (getDivisors(number).sum() < number) return true
    return false
}

fun isAbundant(number: Int): Boolean{
    if (getDivisors(number).sum() > number) return true
    return false
}

fun isSumOfTwoAbundantNumbers(number: Int): Boolean{
    var abundantArray: ArrayList<Int> = ArrayList()
    for (x in 1..number-1){
        if (isAbundant(x)) abundantArray.add(x)
    }

    for (x in abundantArray){
        for (y in abundantArray){
            if (x + y == number) return true
        }
    }

    return false
}

var totalSum: Long = 0L
for (x in 1..28123){
    println("#")
    println(x)
    if (!isSumOfTwoAbundantNumbers(x)) totalSum += x.toLong()
}


println(totalSum)
