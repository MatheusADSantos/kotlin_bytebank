class CalculadoraBonificacao {

    var total : Double = 0.0

    fun registra(funcionario: Funcionario) {
        total += funcionario.bonificacao
    }

    fun registra(gerente: Gerente) {
        total += gerente.bonificacao
    }

    fun registra(diretor: Diretor) {
        total += diretor.bonificacao
    }
}