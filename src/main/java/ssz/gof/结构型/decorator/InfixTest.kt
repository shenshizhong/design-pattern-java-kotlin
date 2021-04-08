package ssz.gof.结构型.decorator

class Account{
    var balance = 100.0

    infix fun add(amount: Double): Unit{
        this.balance = balance + amount
    }
}



infix fun Int.add(x: Int): Int{
    return this + x
}

fun main(args: Array<String>) {
    print(100 add 200)

    val account = Account()
    account add 1000.0
    print(account.balance)

}