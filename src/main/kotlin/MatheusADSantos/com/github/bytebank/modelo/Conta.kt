package MatheusADSantos.com.github.bytebank.modelo

open class Conta(
    val titular: Cliente,
    val numero: Int
) {
    // Utilizando Object Declaration com companion(Deixando acessível a todo projeto)
    companion object {
        var totalContas: Int = 0
            private set
    }

    var saldo = 0.0
        protected set

    init {
        // Executa algo durante a construção
        println("Criando Conta ...")
        totalContas++ // Ou assim -> Companion.totalContas++
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