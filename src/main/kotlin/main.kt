import MatheusADSantos.com.github.bytebank.modelo.Cliente
import MatheusADSantos.com.github.bytebank.modelo.ContaCorrente
import MatheusADSantos.com.github.bytebank.modelo.ContaPoupanca
import MatheusADSantos.com.github.bytebank.modelo.totalContas

fun main() {

    testaContasDiferentes()

    val matheus = Cliente(nome = "Matheus", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = matheus, numero = 1000)
    val contaCorrente = ContaCorrente(titular = matheus, numero = 1001)
    println("\n\n=> Total de Contas Criadas: $totalContas")
}
