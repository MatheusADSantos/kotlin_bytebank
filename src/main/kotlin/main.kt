fun main() {
    println("Bem vindo ao Bytebank")

    val contaMatheus = Conta()
    contaMatheus.titular = "Matheus"
    contaMatheus.numero = 1000
    contaMatheus.setSaldo(200.0)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.setSaldo(300.0)


    println(contaMatheus.getSaldo())

    println("depositando na conta do Matheus")
    contaMatheus.deposita(50.0)
    println(contaMatheus.getSaldo())

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.getSaldo())

//    println("sacando na conta do Matheus")
//    contaMatheus.saca(250.0)
//    println(contaMatheus.getSaldo())
//
//    println("sacando na conta da Fran")
//    contaFran.saca(100.0)
//    println(contaFran.getSaldo())
//
//    println("saque em excesso na conta do Matheus")
//    contaMatheus.saca(100.0)
//    println(contaMatheus.getSaldo())
//
//    println("saque em excesso na conta da Fran")
//    contaFran.saca(500.0)
//    println(contaFran.getSaldo())

//    println("Transferência da conta da Fran para o Matheus")
//
//    if(contaFran.transfere(300.0, contaMatheus)){
//        println("Transferência sucedida")
//    } else {
//        println("Falha na transferência")
//    }
//
//    println(contaMatheus.getSaldo())
//    println(contaFran.getSaldo())
}

class Conta {
    var titular = ""
    var numero = 0
    private var saldo = 0.0

    fun deposita(valor: Double) {
        saldo += valor
    }

    fun saca(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

    fun getSaldo(): Double {
        return saldo
    }

    fun setSaldo(valor: Double) {
        if (valor > 0) {
            saldo = valor
        }
    }
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
