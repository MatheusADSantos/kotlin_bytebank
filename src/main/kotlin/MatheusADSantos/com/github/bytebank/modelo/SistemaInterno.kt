package MatheusADSantos.com.github.bytebank.modelo

import MatheusADSantos.com.github.bytebank.modelo.Autenticavel

class SistemaInterno {

    fun entra(admin: MatheusADSantos.com.github.bytebank.modelo.Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na Autenticação")
        }
    }

}