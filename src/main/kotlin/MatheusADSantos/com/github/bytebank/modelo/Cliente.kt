package MatheusADSantos.com.github.bytebank.modelo
import MatheusADSantos.com.github.bytebank.modelo.Autenticavel as Autenticavel

class Cliente(val nome: String, val cpf: String, private val senha: Int, var endereco: Endereco = Endereco()) : Autenticavel {
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}