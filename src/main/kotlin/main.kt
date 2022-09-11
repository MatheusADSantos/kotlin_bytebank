fun main() {
    println("Bem vindo ao Bytebank")

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
