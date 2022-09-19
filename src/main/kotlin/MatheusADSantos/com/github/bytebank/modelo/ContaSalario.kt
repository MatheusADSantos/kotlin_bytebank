package MatheusADSantos.com.github.bytebank.modelo

class ContaSalario(titular: Cliente, numero: Int) : MatheusADSantos.com.github.bytebank.modelo.Conta(titular = titular, numero = numero) {

    override fun saca(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
        }
    }
}