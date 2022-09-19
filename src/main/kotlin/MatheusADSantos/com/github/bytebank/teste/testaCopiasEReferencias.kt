import MatheusADSantos.com.github.bytebank.modelo.ContaCorrente

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = MatheusADSantos.com.github.bytebank.modelo.ContaCorrente("João", 1002)
    var contaMaria = MatheusADSantos.com.github.bytebank.modelo.ContaCorrente("Maria", 1003)

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}