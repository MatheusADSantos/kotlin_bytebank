fun testCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("modelo.Conta Positiva")
        saldo == 0.0 -> println("modelo.Conta Neutra")
        else -> println("modelo.Conta Negativa")
    }
}