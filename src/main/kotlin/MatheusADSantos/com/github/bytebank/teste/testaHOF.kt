package MatheusADSantos.com.github.bytebank.teste

import MatheusADSantos.com.github.bytebank.modelo.Autenticavel
import MatheusADSantos.com.github.bytebank.modelo.SistemaInterno

fun testaHOF() {
    soma(3, 5, resultado = { valor ->
        println(valor)
    })

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int): Boolean = this.senha == senha
    }
    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("Realizar Pagamento")
    })
}

// HOF: O parâmetro(resultado) é uma 'Lazy Valuation', ou seja, só retorna quando é chamada:
fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("Antes da Soma")
    resultado(a + b)
    println("Depois da Soma")

}
