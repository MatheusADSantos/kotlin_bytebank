import MatheusADSantos.com.github.bytebank.modelo.Endereco

fun main() {
    val endereco: Endereco = Endereco(complemento = "casa", logradouro = "Rua Francisco Paranhos", numero = 61)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)


    endereco
        .let {
            println(it.logradouro.uppercase())
        }

    Endereco(complemento = "casa", logradouro = "Rua Francisco Paranhos", numero = 61)
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }.let(::println)


    listOf(
        Endereco(),
        Endereco(complemento = "casa"),
        Endereco(complemento = "Apartamento"),
        Endereco()
    )
        .filter { endereco -> endereco.complemento.isNotEmpty() }
        .let(::println)


}
