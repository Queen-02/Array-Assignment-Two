fun main() {
    //Question one
    var result = productOfInts(arrayOf(10, 2, 16))
    println(result)

    //Question two
    var sumResult = sumOfDecimals(arrayOf("Lion", 23.5, "Brown", 56, 9.5, 63.2F))
    println(sumResult)

    //Question three
    var sounds = characters(arrayOf('a', 'f', 'e', 'o', 'r', 'u', 'p'))
    println(sounds)

}

//function that takes in an array of integers and returns the product
fun productOfInts(numbers: Array<Int>): Int{
    var multiply = 1

    numbers.forEach { number ->
        multiply*=number
    }
    return multiply
}

//function that takes in mixed types and
//returns the sum of all the decimal elements

fun sumOfDecimals(mixedArrays: Array<Any>): Number{
    var sumDec = 0.0
    mixedArrays.forEach { mixedArray ->
        if (mixedArray is Double || mixedArray is Float){
            sumDec+=mixedArray.toString().toDouble()
        }
    }
    return sumDec
}

//function that takes in an array of characters
//and returns the number of vowels in the array
fun characters(vowels: Array<Char>): Int{
    var char = 0
    vowels.forEach { vowel ->
        if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u'){
            ++char
        }
    }
    return char
}