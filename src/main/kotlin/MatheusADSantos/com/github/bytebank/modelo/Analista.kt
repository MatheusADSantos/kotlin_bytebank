package MatheusADSantos.com.github.bytebank.modelo

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : MatheusADSantos.com.github.bytebank.modelo.Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override val bonificacao: Double = salario * 0.1

}