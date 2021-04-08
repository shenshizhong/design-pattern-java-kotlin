package ssz.gof.结构型.adapter

/**
 *
 * 目标抽象类（Target）: 客户希望的接口
 * 适配器（Adapter）: 适配器
 * 适配者类（Adaptee）: 被适配的角色
 *
 * Created by ssz on 2021/4/8
 */


/** 被适配者 */
open class Adaptee{
    fun adapteeRequest(){
        println("被适配者的方法")
    }

}

interface Target{
    fun request()
}

//第一种写法
/** 类适配器 */
class KClassAdapter: Adaptee(),Target{
    override fun request() {
        super.adapteeRequest()
    }
}


//第二种写法
/** 对象适配器 */
class KObjectAdapter: Target{
    val adaptee = Adaptee()
    override fun request() {
        adaptee.adapteeRequest()
    }

}

fun main(args: Array<String>) {
    val adapter = KClassAdapter()
    adapter.request()//客户希望的方法

    val kObjectAdapter = KObjectAdapter()
    kObjectAdapter.request()
}