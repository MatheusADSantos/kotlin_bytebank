class ContaSalario(titular: String, numero: Int) : Conta(titular = titular, numero = numero) {

    override fun saca(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
        }
    }
}