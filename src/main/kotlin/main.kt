import MatheusADSantos.com.github.bytebank.modelo.Cliente
import MatheusADSantos.com.github.bytebank.modelo.Endereco

fun main() {

    println()
    println(0)
    println(3.14)
    println("Matheus")
    println(true)
    println(false)
    println(Cliente(nome = "Matheus", cpf = "...", senha = 1234))
    val endereco: Endereco = Endereco()
    println(endereco)

    val objeto: Any = Any()
    println(objeto)

    val teste: Any = imprime(endereco)
    println(teste)

    imprime()
    imprime(1)
    imprime(1.0)
    imprime(endereco)

}

fun imprime(){

}

fun imprime(valor: Int){

}

fun imprime(valor: Double){

}

fun imprime(valor: Any) : Any{
    println(valor)
    return valor
}
