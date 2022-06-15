fun main() {
    val likes = 151
    var str: String

    if (likes % 10 == 1 && likes % 100 != 11)
        str = "человеку"
    else
        str = "людям"

    println("Понравилось $likes $str")
}