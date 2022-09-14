fun main() {
    println("Bem vindo ao Bytebank")

    val matheus = Funcionario(
        nome = "Matheus",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome ${matheus.nome}")
    println("cpf ${matheus.cpf}")
    println("salario ${matheus.salario}")
    println("bonificação ${matheus.bonificacao()}")
}