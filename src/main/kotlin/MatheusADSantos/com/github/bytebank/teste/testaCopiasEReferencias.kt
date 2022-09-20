import MatheusADSantos.com.github.bytebank.modelo.Cliente
import MatheusADSantos.com.github.bytebank.modelo.ContaCorrente
import MatheusADSantos.com.github.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome = "João", cpf = "111.111.111-11", senha = 1)
    val contaJoao = ContaCorrente(joao, 1002)
    var contaMaria = ContaPoupanca(titular = Cliente(
        nome = "Maria",
        cpf = "222.222.222-22",
        senha = 2
    ), numero = 1003)

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}