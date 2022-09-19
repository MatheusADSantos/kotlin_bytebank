package MatheusADSantos.com.github.bytebank.modelo

abstract class ContaTransferivel(titular: String, numero: Int) : MatheusADSantos.com.github.bytebank.modelo.Conta(titular = titular, numero = numero) {

    fun transfere(valor: Double, destino: MatheusADSantos.com.github.bytebank.modelo.Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

}