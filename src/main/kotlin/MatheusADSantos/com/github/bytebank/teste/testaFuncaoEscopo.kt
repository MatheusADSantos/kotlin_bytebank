package MatheusADSantos.com.github.bytebank.teste

import MatheusADSantos.com.github.bytebank.modelo.Endereco

fun testaFuncaoEscopo() {
//    val endereco: Endereco = Endereco(complemento = "casa", logradouro = "Rua Francisco Paranhos", numero = 61)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)

    run {
        println("Executando o run sem extensão")
    }

    val endereco = Endereco()
        .also { println("Criando Endereço") }
        .apply {
            complemento = "casa"
            logradouro = "Rua Francisco Paranhos"
            numero = 61
        }

    with(endereco) {
        "$logradouro, $numero".toUpperCase()
    }.let { enderecoEmMaiusculo: String ->
        println(enderecoEmMaiusculo)
    }


    listOf(
        Endereco(),
        Endereco(complemento = "casa"),
        Endereco(complemento = "Apartamento"),
        Endereco()
    )
        .filter(predicate = { endereco -> endereco.complemento.isNotEmpty() })
        .let(block = ::println)
}