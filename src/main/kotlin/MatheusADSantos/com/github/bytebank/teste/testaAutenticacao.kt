import MatheusADSantos.com.github.bytebank.modelo.Cliente
import MatheusADSantos.com.github.bytebank.modelo.Diretor
import MatheusADSantos.com.github.bytebank.modelo.Gerente
import MatheusADSantos.com.github.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {

    val gerente = MatheusADSantos.com.github.bytebank.modelo.Gerente(
        nome = "Matheus",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000
    )
    val diretora = MatheusADSantos.com.github.bytebank.modelo.Diretor(
        nome = "Matheus",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 2000,
        plr = 200.0
    )
    val cliente =
        MatheusADSantos.com.github.bytebank.modelo.Cliente(nome = "Alex", cpf = "333.333.333-33", senha = 1234)

    val sistema = MatheusADSantos.com.github.bytebank.modelo.SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretora, 2000)
    sistema.entra(cliente, 1234)
}