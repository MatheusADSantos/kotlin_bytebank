package MatheusADSantos.com.github.bytebank.modelo

import MatheusADSantos.com.github.bytebank.modelo.Funcionario as Funcionario

class Analista(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int = 0
) : Funcionario(nome = nome, cpf = cpf, salario = salario), Autenticavel {

    override val bonificacao: Double = salario * 0.1
    override fun autentica(senha: Int): Boolean = this.senha == senha

}