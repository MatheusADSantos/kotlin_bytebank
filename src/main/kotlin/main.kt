import MatheusADSantos.com.github.bytebank.modelo.Endereco

fun main() {

    val endereco: Endereco = Endereco(logradouro = "Rua Francisco Paranhos", complemento = "casa")
    val endereco2: Endereco = Endereco(logradouro = "Rua Osmar de Assis", complemento = "casa")

    println(endereco.equals(endereco)) // Objetos Iguais
    println(endereco.equals(endereco2)) // Objetos Diferentes

    // Imprimir o objeto direto ou chamando o método toString() irão retornar a mesma coisa (Classe e o endereço)
    println(endereco.toString())
    println(endereco2.toString())
    println(endereco)
    println(endereco2)

    println(endereco.hashCode())
    println(endereco2.hashCode())

}
