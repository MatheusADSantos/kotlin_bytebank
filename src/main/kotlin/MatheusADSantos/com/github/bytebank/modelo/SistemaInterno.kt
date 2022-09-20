package MatheusADSantos.com.github.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na Autenticação")
        }

        when (admin) {
            is FuncionarioAdmin -> {
                println("Opção Admin")
            }
            is Funcionario -> {
                println("Opção Comum")
            }
            else -> {
                println("Opções Reduzidas")
            }
        }

    }

}