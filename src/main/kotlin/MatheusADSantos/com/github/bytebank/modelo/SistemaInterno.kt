package MatheusADSantos.com.github.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int, autenticado: () -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Bytebank")
            autenticado()
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