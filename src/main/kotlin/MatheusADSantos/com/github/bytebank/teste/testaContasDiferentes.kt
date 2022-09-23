import MatheusADSantos.com.github.bytebank.modelo.*
import MatheusADSantos.com.github.bytebank.modelo.ContaPoupanca as ContaPoupanca
import MatheusADSantos.com.github.bytebank.modelo.ContaPoupanca as ContaCorrente
import MatheusADSantos.com.github.bytebank.modelo.ContaPoupanca as ContaSalario

fun testaContasDiferentes() {
    val contaPoupanca = ContaPoupanca(titular = Cliente(
        nome = "Matheus1",
        cpf = "777.777.777-77",
        senha = 123,
        endereco = Endereco(logradouro = "Rua Francisco Paranhos", numero = 61)
    ), numero = 1000)

    println("titular")
    println("titular ${contaPoupanca.titular}")
    println("nome do titular ${contaPoupanca.titular.nome}")
    println("cpf do titular ${contaPoupanca.titular.cpf}")
    println("endereco titular ${contaPoupanca.titular.endereco}")

    val contaCorrente = ContaCorrente(titular = Cliente(
        nome = "Matheus2",
        cpf = "777.777.777-77",
        senha = 321
    ), numero = 2000)
    val contaSalario = ContaSalario(titular = Cliente(
        nome = "Matheus3",
        cpf = "777.777.777-77",
        senha = 312
    ), numero = 3000)

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
    contaPoupanca.transfere(100.0, contaCorrente, senha = 123)
    println("Saldo Pop(pós transf.): ${contaPoupanca.saldo}")
    println("Saldo CC(pós transf.): ${contaCorrente.saldo}")

    println("\nTransferindo de CC -> Pop")
    contaCorrente.transfere(100.0, contaPoupanca, senha = 123)
    println("Saldo Pop(pós transf.): ${contaPoupanca.saldo}")
    println("Saldo CC(pós transf.): ${contaCorrente.saldo}")

    """
            println("\nTransferindo de CS -> Pop")
            Não da para transferir, pois, a modelo.ContaSalario é herdada de modelo.Conta e modelo.Conta não tem esse método
            contaSalario.transfere(100.0, contaPoupanca)
    """.trimIndent()

}