fun main() {
    println("Bem vindo ao Bytebank")

    val contaMatheus = Conta()
    contaMatheus.titular = "Matheus"
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

    println("Depositando na conta do Matheus")
    deposita(contaMatheus, 50.0)
    println(contaMatheus.saldo)

    println("Depositando na conta da Fran")
    deposita(contaFran, 70.0)
    println(contaFran.saldo)
}

fun deposita(conta: Conta, valor: Double) {
    conta.saldo += valor
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = Conta()
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
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
