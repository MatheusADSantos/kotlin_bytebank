import MatheusADSantos.com.github.bytebank.modelo.Cliente
import MatheusADSantos.com.github.bytebank.modelo.ContaCorrente

fun testaComportamentosConta() {
    val matheus = Cliente(nome = "Matheus", cpf = "777.777.777-77", senha = 123)
    val contaMatheus = MatheusADSantos.com.github.bytebank.modelo.ContaCorrente(matheus, 1000)
    contaMatheus.deposita(200.0)

    val fran = Cliente(nome = "Fran", cpf = "888.888.888-88", senha = 321)
    val contaFran = MatheusADSantos.com.github.bytebank.modelo.ContaCorrente(fran, 1001)
    contaFran.deposita(300.0)


    println(contaMatheus.saldo)

    println("depositando na conta do Matheus")
    contaMatheus.deposita(50.0)
    println(contaMatheus.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta do Matheus")
    contaMatheus.saca(250.0)
    println(contaMatheus.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Matheus")
    contaMatheus.saca(100.0)
    println(contaMatheus.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Matheus")

    if(contaFran.transfere(300.0, contaMatheus)){
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaFran.saldo)
    println(contaMatheus.saldo)
}