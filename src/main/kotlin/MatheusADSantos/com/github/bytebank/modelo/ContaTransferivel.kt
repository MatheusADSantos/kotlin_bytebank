package MatheusADSantos.com.github.bytebank.modelo

import MatheusADSantos.com.github.bytebank.exception.SaldoInsuficienteException

abstract class ContaTransferivel(titular: Cliente, numero: Int) : Conta(titular = titular, numero = numero) {

    fun transfere(valor: Double, destino: Conta) {
        if (saldo < valor) {
            throw SaldoInsuficienteException()
        }
        saldo -= valor
        destino.deposita(valor)
    }

}