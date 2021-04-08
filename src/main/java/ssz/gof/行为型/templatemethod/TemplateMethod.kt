package ssz.gof.行为型.templatemethod

fun execute(task: () -> Unit) {
    val startTime = System.currentTimeMillis()
    task()
    println("Work took ${System.currentTimeMillis() - startTime} millis")
}


fun main(args: Array<String>) {
    execute {
        println("Working...")
    }
}
