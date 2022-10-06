import MatheusADSantos.com.github.bytebank.modelo.Endereco

fun main() {
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

