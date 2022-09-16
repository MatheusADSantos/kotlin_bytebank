class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double) {
        if (valor <= saldo) {
            val valorComTaxa = valor + 0.1
            saldo -= valorComTaxa
        }
    }
}