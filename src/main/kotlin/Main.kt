fun main(args: Array<String>) {

//Access a String
    var txt:String = "Hello World"
    var txxt: Int = 10
    println(txt[0])

//String Length

    var txt1:String = "Whatever"

    println("Just add here ${txt1.length}")

//String Functions

    var txt2: String = "mary on cross"


    println(txt2.toUpperCase())
    println(txt2.toLowerCase())

//String compareTo: return 0 means equal, negative means if it's less than other, positive if it's greater than other

    val text : String = "MONY"
    val text1: String = "MONY"
    var text2: String = "mony"
    var text3: String = text2.toUpperCase()


    println(text.compareTo(text1))
    println(txt.equals(txt1))
    println(txt.equals(txxt))
    println(txt.equals(txt))
    println(text.equals(text3))
    println(text3)
    println(text==text1)

// hashcode is an integer value that is associated w each object
    println(text.hashCode())

// String Concatenation

    println(text.plus(text1))

//or

    println (text + text1)

//toString

    var phone_number : Int = 123456
    println(phone_number.toString())

// IndexOf means find index of sth

    println(text.lastIndexOf("s"))
    println(text.indexOf("M"))

//String Interpolation
    var firstName: String = "Chansovanmony"
    var lastName : String = "Yoeun"

    println("My name is ${firstName} ${lastName}")

//or
    println("My name is $firstName $lastName")






}