

fun d(number: Int): Int{
    var resultArray: ArrayList<Int> = ArrayList()
    for (x in 1..number-1){
        if (number % x == 0) resultArray.add(x)
    }
    return resultArray.sum()
}

fun isAmicable(number: Int): Boolean{
    val dResult = d(number)

    if (d(dResult) == number && dResult != number) return true

    return false
}

var amicableList: ArrayList<Int> = ArrayList()

for (x in 1..10000){
    if (isAmicable(x) && !(amicableList.contains(x))) {
        amicableList.add(x)
    }
}

println(amicableList.sum())
