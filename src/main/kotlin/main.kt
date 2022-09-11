fun main() {
    println("Bem vindo ao Bytebank")

    val contaMatheus = Conta()
    contaMatheus.titular = "Alex"
    contaMatheus.numero = 1000
    contaMatheus.saldo = 200.0

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaMatheus.titular)
    println(contaMatheus.numero)
    println(contaMatheus.saldo)
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaLacos() {
    for (i in 1..5) {
        val titular: String = "Matheus $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("titular $titular") // titular Matheus
        println("número da conta $numeroConta")
        println("saldo da conta $saldo \n")
    }

//    testCondicoes(saldo)
}

fun testCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta Positiva")
        saldo == 0.0 -> println("Conta Neutra")
        else -> println("Conta Negativa")
    }
}
