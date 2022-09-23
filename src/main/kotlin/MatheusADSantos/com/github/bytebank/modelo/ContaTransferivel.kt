package MatheusADSantos.com.github.bytebank.modelo

import MatheusADSantos.com.github.bytebank.exception.FalhaAutenticacaoException
import MatheusADSantos.com.github.bytebank.exception.SaldoInsuficienteException
import java.lang.NumberFormatException

abstract class ContaTransferivel(titular: Cliente, numero: Int) : Conta(titular = titular, numero = numero) {

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(mensagem = "\nSaldo Insuficiente, saldo: $saldo \nValor a ser transferido: $valor")
        }
        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }
//        throw NumberFormatException()

        saldo -= valor
        destino.deposita(valor)
    }

}