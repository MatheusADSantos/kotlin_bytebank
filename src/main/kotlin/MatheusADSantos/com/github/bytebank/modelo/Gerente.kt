package MatheusADSantos.com.github.bytebank.modelo

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : MatheusADSantos.com.github.bytebank.modelo.FuncionarioAdmin(nome, cpf, salario, senha) {

    override val bonificacao: Double = salario

}