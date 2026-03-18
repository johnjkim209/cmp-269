fun main() {
    println("hi world")

    var studentName: String = "John"
    var middleName: String? = null

    println("Welcome, $studentName ${middleName ?: "No Middle Name"}!")

}