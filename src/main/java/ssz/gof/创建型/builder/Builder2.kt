package ssz.gof.创建型.builder

data class Bike(var color: String = "red",
                var gears: Int = 3, var rack: Boolean = false)

fun main(args: Array<String>) {
    println("${Bike(gears = 16, color = "blue", rack = true)}")
}