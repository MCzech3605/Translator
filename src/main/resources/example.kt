fun add(a: Int, b: Int): Int {
    return a + b
}

fun main(): Int {
    var a: Int = 5
    var b: Int = 10
    while (a <= b) {
        printf("Hello")
        a++
    }

    if (a < 1)
        return 5
    else {
        a = 12
        b = 8
        var c : Int = add(a, b)
    }
    return 0
}