import MatheusADSantos.com.github.bytebank.modelo.Cliente
import MatheusADSantos.com.github.bytebank.modelo.ContaCorrente

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome = "João", cpf = "111.111.111-11", senha = 1)
    val contaJoao = MatheusADSantos.com.github.bytebank.modelo.ContaCorrente(joao, 1002)
    var contaMaria = MatheusADSantos.com.github.bytebank.modelo.ContaPoupanca(titular = Cliente(
        nome = "Maria",
        cpf = "222.222.222-22",
        senha = 2
    ), numero = 1003)

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}