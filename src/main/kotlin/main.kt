import MatheusADSantos.com.github.bytebank.modelo.Autenticavel
import MatheusADSantos.com.github.bytebank.modelo.Endereco
import MatheusADSantos.com.github.bytebank.modelo.SistemaInterno

fun main() {
    val endereco: Endereco = Endereco(complemento = "casa", logradouro = "Rua Francisco Paranhos", numero = 61)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)


    endereco
        .let {
            println(it.logradouro.uppercase())
        }

    Endereco(complemento = "casa", logradouro = "Rua Francisco Paranhos", numero = 61)
//            Utilizando Função de Escopo (apply) que traz objeto receiver como this
        .run {
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

    soma(3, 5, resultado = { valor ->
        println(valor)
    })

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int): Boolean = this.senha == senha
    }
    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("Realizar Pagamento")
    })

}

// HOF: O parâmetro(resultado) é uma 'Lazy Valuation', ou seja, só retorna quando é chamada:
fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("Antes da Soma")
    resultado(a + b)
    println("Depois da Soma")

}
