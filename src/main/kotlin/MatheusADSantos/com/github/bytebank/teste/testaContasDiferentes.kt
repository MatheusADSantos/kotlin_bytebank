import MatheusADSantos.com.github.bytebank.modelo.ContaCorrente
import MatheusADSantos.com.github.bytebank.modelo.ContaPoupanca
import MatheusADSantos.com.github.bytebank.modelo.ContaSalario

fun testaContasDiferentes() {
    val contaPoupanca = MatheusADSantos.com.github.bytebank.modelo.ContaPoupanca(titular = "Matheus", numero = 1000)
    val contaCorrente = MatheusADSantos.com.github.bytebank.modelo.ContaCorrente(titular = "Ana", numero = 2000)
    val contaSalario = MatheusADSantos.com.github.bytebank.modelo.ContaSalario(titular = "Maria", numero = 3000)

    println("\nDepositando nas contas ...")
    contaPoupanca.deposita(1000.0)
    println("Saldo Pop: ${contaPoupanca.saldo}")
    contaCorrente.deposita(1000.0)
    println("Saldo CC: ${contaCorrente.saldo}")
    contaSalario.deposita(1000.0)
    println("Saldo CS: ${contaSalario.saldo}")

    println("\nSacando ...")
    contaPoupanca.saca(100.0)
    println("Saldo Pop(pós saque): ${contaPoupanca.saldo}")
    contaCorrente.saca(100.0)
    println("Saldo CC(pós saque): ${contaCorrente.saldo}")
    contaSalario.saca(100.0)
    println("Saldo CS(pós saque): ${contaSalario.saldo}")

    println("\nTransferindo de Pop -> CC")
    contaPoupanca.transfere(100.0, contaCorrente)
    println("Saldo Pop(pós transf.): ${contaPoupanca.saldo}")
    println("Saldo CC(pós transf.): ${contaCorrente.saldo}")

    println("\nTransferindo de CC -> Pop")
    contaCorrente.transfere(100.0, contaPoupanca)
    println("Saldo Pop(pós transf.): ${contaPoupanca.saldo}")
    println("Saldo CC(pós transf.): ${contaCorrente.saldo}")

    """
            println("\nTransferindo de CS -> Pop")
            Não da para transferir, pois, a modelo.ContaSalario é herdada de modelo.Conta e modelo.Conta não tem esse método
            contaSalario.transfere(100.0, contaPoupanca)
    """.trimIndent()

}