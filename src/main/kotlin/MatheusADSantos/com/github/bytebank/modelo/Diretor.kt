package MatheusADSantos.com.github.bytebank.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : MatheusADSantos.com.github.bytebank.modelo.FuncionarioAdmin(nome, cpf, salario, senha) {

    override val bonificacao: Double = salario + plr

}