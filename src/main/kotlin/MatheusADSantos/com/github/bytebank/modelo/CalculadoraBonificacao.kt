package MatheusADSantos.com.github.bytebank.modelo

class CalculadoraBonificacao {

    var total : Double = 0.0

    fun registra(funcionario: Any) {
        if (funcionario is Funcionario) {
            total += funcionario.bonificacao
        }
    }

}