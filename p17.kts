
var counter = 0
var letterCount: Long= 0L

fun inWords(number: Int): String{
    var result = ""
    if (number == 1000) return "one thousand"

    val hundreds = number / 100
    when (hundreds){
        1 -> result += "one hundred"
        2 -> result += "two hundred"
        3 -> result += "three hundred"
        4 -> result += "four hundred"
        5 -> result += "five hundred"
        6 -> result += "six hundred"
        7 -> result += "seven hundred"
        8 -> result += "eight hundred"
        9 -> result += "nine hundred"
    }


    var tens = number % 100
    if (tens == 0) return result

    when (tens){
        1 -> result += " and one"
        2 -> result += " and two"
        3 -> result += " and three"
        4 -> result += " and four"
        5 -> result += " and five"
        6 -> result += " and six"
        7 -> result += " and seven"
        8 -> result += " and eight"
        9 -> result += " and nine"
        10 -> result += " and ten"
        11 -> result += " and eleven"
        12 -> result += " and twelve"
        13 -> result += " and thirteen"
        14 -> result += " and fourteen"
        15 -> result += " and fifteen"
        16 -> result += " and sixteen"
        17 -> result += " and seventeen"
        18 -> result += " and eighteen"
        19 -> result += " and nineteen"
    }

    when (tens / 10) {
        2 -> result += " and twenty"
        3 -> result += " and thirty"
        4 -> result += " and forty"
        5 -> result += " and fifty"
        6 -> result += " and sixty"
        7 -> result += " and seventy"
        8 -> result += " and eighty"
        9 -> result += " and ninety"
    }


    if (tens > 19){
        when ( tens % 10 ){
            1 -> result += " one"
            2 -> result += " two"
            3 -> result += " three"
            4 -> result += " four"
            5 -> result += " five"
            6 -> result += " six"
            7 -> result += " seven"
            8 -> result += " eight"
            9 -> result += " nine"
        }
    }

    if (number < 100){
        result = ""

        when (tens){
            1 -> result += "one"
            2 -> result += "two"
            3 -> result += "three"
            4 -> result += "four"
            5 -> result += "five"
            6 -> result += "six"
            7 -> result += "seven"
            8 -> result += "eight"
            9 -> result += "nine"
            10 -> result += "ten"
            11 -> result += "eleven"
            12 -> result += "twelve"
            13 -> result += "thirteen"
            14 -> result += "fourteen"
            15 -> result += "fifteen"
            16 -> result += "sixteen"
            17 -> result += "seventeen"
            18 -> result += "eighteen"
            19 -> result += "nineteen"
        }

        when (tens / 10){
            2 -> result += "twenty"
            3 -> result += "thirty"
            4 -> result += "forty"
            5 -> result += "fifty"
            6 -> result += "sixty"
            7 -> result += "seventy"
            8 -> result += "eighty"
            9 -> result += "ninety"
        }

        if (number > 19)
        {
            when (tens % 10)
            {
                1 -> result += " one"
                2 -> result += " two"
                3 -> result += " three"
                4 -> result += " four"
                5 -> result += " five"
                6 -> result += " six"
                7 -> result += " seven"
                8 -> result += " eight"
                9 -> result += " nine"
            }
        }
    }

    return result

}

fun countStringLetters(stringValue: String): Int{
    val response = stringValue.replace(" ", "")
    return response.length
}

for (x in 1..1000){
    var word = inWords(x)
    println(x)
    println(word)
    letterCount += countStringLetters(word)
    println(letterCount)
    println(countStringLetters(word))
    println("##")
}

println(letterCount)
