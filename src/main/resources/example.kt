fun add(a: Int, b: Int): Int {
    return a + b
}

fun main(argCount: Int, args: String): Int {
    var a: Int = 5
    var b: Int = 10
    while (a <= b) {
        print("Hello")
        a++
    }

    if (argCount > 1)
        return 5
    else {
        a = 12
        b = 8
        print(add(a, b))
    }
    return 0
}