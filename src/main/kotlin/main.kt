fun main() {
    println("Bem vindo ao Bytebank")

    val matheus = Funcionario(nome = "Matheus", cpf = "111.111.111-11", salario = 1000.0)

    println("nome ${matheus.nome}")
    println("cpf ${matheus.cpf}")
    println("salario ${matheus.salario}")
    println("bonificação ${matheus.bonificacao}")

    val fran = Gerente(nome = "Fran", cpf = "222.222.222-22", salario = 2000.0, senha = 123)

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao}")

    if (fran.autenticacao(senha = 123)) {
        println("Autenticado com Sucesso!")
    } else {
        println("Falha na Autenticação")
    }

    val gui = Diretor(nome = "Gui", cpf = "333.333.333-33", salario = 4000.0, senha = 4000, plr = 200.0)

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificação ${gui.bonificacao}")
    println("plr ${gui.plr}")

    if (gui.autenticacao(senha = 123)) {
        println("Autenticado com Sucesso!")
    } else {
        println("Falha na Autenticação")
    }

    val maria = Analista("Maria", cpf = "444.4444.4444-44", salario = 3000.0)

    var calculadora = CalculadoraBonificacao()
    calculadora.registra(matheus)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)
    println("Total Bionificação: ${calculadora.total}")
}