fun testaComportamentosConta() {
    val contaMatheus = Conta("Matheus", 1000)
    contaMatheus.deposita(200.0)

    val contaFran = Conta("Fran", 1001)
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