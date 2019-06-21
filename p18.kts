import java.io.File
import java.util.stream.Collectors

fun readFile(filename: String): String = File(filename).readText(Charsets.UTF_8)

val fileContent = readFile("p18.txt")

val lines = fileContent.split(System.getProperty("line.separator"))
val linesMap: HashMap<Int, ArrayList<Int>> = HashMap()
val maxValuesList : ArrayList<Int> = ArrayList()


var counter = 0
for (line in lines){
    val newLine = line.split(" ")
    var finalLine: ArrayList<Int> = ArrayList()
    for (value in newLine){
        finalLine.add(value.toInt())
    }
    linesMap[counter] = finalLine
    counter += 1
}

var currentIndex = 1
var nextIndex1 = currentIndex
var nextIndex2 = currentIndex


for (row in linesMap){

    if (row.key == 0){
        maxValuesList.add( row.value.get(currentIndex - 1) )
        nextIndex1 = currentIndex
        nextIndex2 = currentIndex + 1
        continue
    }

    var value1 = row.value.get(nextIndex1 - 1)
    var value2 = row.value.get(nextIndex2 - 1)

    if ( value1 > value2 ){
        maxValuesList.add(value1)
        nextIndex1 = nextIndex1
        nextIndex2 = nextIndex1 + 1
    }

    else if ( value2 > value1){
        maxValuesList.add(value2)
        nextIndex1 = nextIndex2
        nextIndex2 = nextIndex2 + 1
    }

}

var finalSum = 0
println(maxValuesList)
for ( item in maxValuesList)
{
    finalSum += item
}

println(finalSum)