package MatheusADSantos.com.github.bytebank.modelo

class ContaCorrente(titular: String, numero: Int) : MatheusADSantos.com.github.bytebank.modelo.ContaTransferivel(titular = titular, numero = numero) {

    override fun saca(valor: Double) {
        if (valor <= saldo) {
            val valorComTaxa = valor + 0.1
            saldo -= valorComTaxa
        }
    }
}