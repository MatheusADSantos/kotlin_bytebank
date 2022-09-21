import MatheusADSantos.com.github.bytebank.modelo.Endereco

fun main() {

    val endereco1: Endereco = Endereco(
        logradouro = "Rua Francisco Paranhos",
        complemento = "casa",
        cep = "000.000.000-00"
    )
    val endereco2: Endereco = Endereco(
        logradouro = "Rua Francisco Paranhos",
        complemento = "casa",
        cep = "000.000.000-00"
    )

    println("\nEndereço1 é igual ao Endereço2: ${endereco1.equals(endereco2)}\n")

    // Imprimir o objeto direto ou chamando o método toString() irão retornar a mesma coisa (Classe e o endereço)
    println(endereco1.toString())
    println(endereco2.toString())

    println(endereco1.hashCode())
    println(endereco2.hashCode())

}
