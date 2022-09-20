package MatheusADSantos.com.github.bytebank.modelo

class ContaSalario(titular: Cliente, numero: Int) : Conta(titular = titular, numero = numero) {

    override fun saca(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
        }
    }
}