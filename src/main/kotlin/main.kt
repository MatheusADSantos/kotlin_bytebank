import MatheusADSantos.com.github.bytebank.modelo.*

fun main() {

//    Utilizando Object Expression
    val fran = object: Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "121.123.124-15"
        val senha: Int = 123

        override fun autentica(senha: Int): Boolean = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, senha = 123)
    println("Utilizando o object expression \nTitular: ${fran.nome}")

    testaContasDiferentes()

    val matheus = Cliente(nome = "Matheus", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = matheus, numero = 1000)
    val contaCorrente = ContaCorrente(titular = matheus, numero = 1001)
    println("\n\n=> Total de Contas Criadas: $totalContas")
}
