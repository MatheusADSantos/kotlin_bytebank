open class Conta(
    val titular: String,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    init {
        // Executa algo durante a construção
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    open fun saca(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
        }
    }

    open fun saca() {}
}