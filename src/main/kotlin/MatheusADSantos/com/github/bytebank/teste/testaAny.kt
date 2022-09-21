package MatheusADSantos.com.github.bytebank.teste

import MatheusADSantos.com.github.bytebank.modelo.Endereco

fun testaAny() {

    val endereco: Endereco = Endereco(
        logradouro = "Rua Francisco Paranhos",
        complemento = "casa",
        cep = "000.000.000-00"
    )
    val enderecoNovo: Endereco = Endereco(
        logradouro = "Rua Francisco Paranhos",
        complemento = "casa",
        cep = "000.000.000-00"
    )

    println("\nEndereço é igual ao Endereço Novo: ${endereco.equals(enderecoNovo)}\n")

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
    println()

    println(endereco)
    println(enderecoNovo)

    println(
        "${endereco.javaClass}@${
            Integer.toHexString(endereco.hashCode())
        }"
    )
}

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}