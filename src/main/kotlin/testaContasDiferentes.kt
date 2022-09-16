fun testaContasDiferentes() {
    val contaPoupanca = ContaPoupanca("Matheus", 1000)
    val contaCorrente = ContaCorrente("Matheus", 1000)

    println("\nDepositando nas contas ...")
    contaPoupanca.deposita(1000.0)
    println("Saldo Pop: ${contaPoupanca.saldo}")
    contaCorrente.deposita(1000.0)
    println("Saldo CC: ${contaCorrente.saldo}")

    println("\nSacando ...")
    contaPoupanca.saca(100.0)
    println("Saldo Pop(pós saque): ${contaPoupanca.saldo}")
    contaCorrente.saca(100.0)
    println("Saldo CC(pós saque): ${contaCorrente.saldo}")

    println("\nTransferindo de Pop -> CC")
    contaPoupanca.transfere(100.0, contaCorrente)
    println("Saldo Pop(pós transf.): ${contaPoupanca.saldo}")
    println("Saldo CC(pós transf.): ${contaCorrente.saldo}")

    println("\nTransferindo de CC -> Pop")
    contaCorrente.transfere(100.0, contaPoupanca)
    println("Saldo Pop(pós transf.): ${contaPoupanca.saldo}")
    println("Saldo CC(pós transf.): ${contaCorrente.saldo}")
}