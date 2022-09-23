import MatheusADSantos.com.github.bytebank.exception.FalhaAutenticacaoException
import MatheusADSantos.com.github.bytebank.exception.SaldoInsuficienteException
import MatheusADSantos.com.github.bytebank.modelo.Cliente
import MatheusADSantos.com.github.bytebank.modelo.ContaCorrente
import java.lang.Exception

fun testaComportamentosConta() {
    val matheus = Cliente(nome = "Matheus", cpf = "777.777.777-77", senha = 123)
    val contaMatheus = ContaCorrente(matheus, 1000)
    contaMatheus.deposita(200.0)

    val fran = Cliente(nome = "Fran", cpf = "888.888.888-88", senha = 321)
    val contaFran = ContaCorrente(fran, 1001)
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

    try {
//        contaFran.transfere(valor = 300.0, destino = contaMatheus, senha = 321) // Falha na Transferencia - Saldo Ins
//        contaFran.transfere(valor = 30.0, destino = contaMatheus, senha = 123) // Falha na Transferencia - Aut.
        contaFran.transfere(valor = 30.0, destino = contaMatheus, senha = 321)
        println("Transferência sucedida")
    } catch (e: SaldoInsuficienteException) {
        println("Falha na transferência")
        println("Saldo Insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        println("Falha na transferência")
        println("Saldo na Autenticação")
        e.printStackTrace()
    } catch (e: Exception) { // Lembrar de sempre deixar o catch da Exception genérica no final!!!
        println("Erro Desconhecido")
        e.printStackTrace()
    }

    println(contaFran.saldo)
    println(contaMatheus.saldo)
}