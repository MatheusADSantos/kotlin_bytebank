import MatheusADSantos.com.github.bytebank.modelo.Endereco

fun main() {
    // Nesta situação ao desembrulharmos a val irá gerar uma Execption do tipo NullPointerException
    val enderecoNulo: Endereco? = null
    val enderecoNaoNulo: Endereco = enderecoNulo!!
    enderecoNaoNulo.logradouro
}