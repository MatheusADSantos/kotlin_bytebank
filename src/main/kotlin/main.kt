fun main() {
    println("Bem vindo ao Bytebank")

    val contaMatheus = Conta("Matheus", 1000)
    contaMatheus.deposita(200.0)

    val contaFran = Conta("Fran", 1001)
    contaFran.deposita(300.0)


    println(contaMatheus.saldo)

    println("depositando na conta do Matheus")
    contaMatheus.deposita(50.0)
    println(contaMatheus.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta do Matheus")
    contaMatheus.saca(250.0)
    println(contaMatheus.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Matheus")
    contaMatheus.saca(100.0)
    println(contaMatheus.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Matheus")

    if(contaFran.transfere(300.0, contaMatheus)){
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaMatheus.saldo)
    println(contaFran.saldo)
}

class Conta(
    val titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

    init {
        // Executa algo durante a construção
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
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
}

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta("João", 1002)
    var contaMaria = Conta("Maria", 1003)

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
