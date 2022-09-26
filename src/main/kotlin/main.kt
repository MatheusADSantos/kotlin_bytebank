import MatheusADSantos.com.github.bytebank.modelo.Endereco

fun main() {

    // Safe Call - Com -> '?.let' -> Análoga ao 'if let' do swift
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua Francisco Paranhos")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {
        println(it.logradouro.length)
    }

    // Chamadas sem o let
    enderecoNulo?.logradouro?.length


}