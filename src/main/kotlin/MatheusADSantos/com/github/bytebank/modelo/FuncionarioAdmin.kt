package MatheusADSantos.com.github.bytebank.modelo

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : MatheusADSantos.com.github.bytebank.modelo.Funcionario(nome = nome, cpf = cpf, salario = salario),
    MatheusADSantos.com.github.bytebank.modelo.Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}