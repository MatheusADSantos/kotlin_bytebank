import MatheusADSantos.com.github.bytebank.modelo.Endereco
import kotlin.reflect.typeOf

fun main() {

    // Safe Call - Com -> '?.let' -> Análoga ao 'if let' do swift
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua Francisco Paranhos", complemento = "prédio")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {
        println(it.logradouro.length)
        // Testando o Elvis Operator
        val tamanhoComplemento: Int = it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoComplemento)
    }

    teste("")
    teste(1)
}

// Testando o Safe Cast - Caso venha algo diferente de um número, retorna null
fun teste(valor: Any) {
    val numero: Int? = valor as? Int
    println(numero)
}