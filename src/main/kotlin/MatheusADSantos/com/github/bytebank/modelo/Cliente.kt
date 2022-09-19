package MatheusADSantos.com.github.bytebank.modelo

class Cliente(val nome: String, val cpf: String, private val senha: Int) :
    MatheusADSantos.com.github.bytebank.modelo.Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }


}