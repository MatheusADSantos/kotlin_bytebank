package MatheusADSantos.com.github.bytebank.modelo

class CalculadoraBonificacao {

    var total : Double = 0.0

    fun registra(funcionario: MatheusADSantos.com.github.bytebank.modelo.Funcionario) {
        total += funcionario.bonificacao
    }

}