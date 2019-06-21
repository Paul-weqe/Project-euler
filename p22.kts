import java.io.File

fun readFile(filename: String): String = File(filename).readText(Charsets.UTF_8)
var fileContent = readFile("p22.txt")
fileContent = fileContent.replace("\"", "")

var names = fileContent.split(",")
names = names.sorted()

val letterValues = mapOf(
        "A" to 1,
        "B" to 2,
        "C" to 3,
        "D" to 4,
        "E" to 5,
        "F" to 6,
        "G" to 7,
        "H" to 8,
        "I" to 9,
        "J" to 10,
        "K" to 11,
        "L" to 12,
        "M" to 13,
        "N" to 14,
        "O" to 15,
        "P" to 16,
        "Q" to 17,
        "R" to 18,
        "S" to 19,
        "T" to 20,
        "U" to 21,
        "V" to 22,
        "W" to 23,
        "X" to 24,
        "Y" to 25,
        "Z" to 26
)

var totalValue: Long = 0L
var counter: Int = 0

for (name in names){
    counter += 1
    for (character in name){
        totalValue += letterValues.get(character.toString())!!.toLong() * counter.toLong()
    }
}

println(totalValue)
