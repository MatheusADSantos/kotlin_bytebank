import MatheusADSantos.com.github.bytebank.modelo.*

fun main() {
//    testaWith()

    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    val contaPoupanca = ContaPoupanca(Cliente(nome = "Matheus Augusto",cpf = "111.111.111-11", senha = 1234), 1000)

    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }.let { rendimentoMensal ->
        println("Rendimento Mensal: $rendimentoMensal")
    }

    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("Simulação do Rendimento Anual: $rendimentoAnual")



}

fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua Francisco Paranhos"
        numero = 318
        bairro = "Vila Mariana"
        cidade = "São Paulo"
        estado = "SP"
        cep = "02310-063"
        complemento = "casa"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}

