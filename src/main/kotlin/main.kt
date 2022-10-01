import MatheusADSantos.com.github.bytebank.teste.testaExpressao

fun main() {

    val minhaFuncao = ::teste
    println(minhaFuncao())

    val minhaFuncaoClasse = ::Teste
    println(minhaFuncaoClasse())

}

fun teste() {
    println("Executa teste")
}

class Teste: () -> Unit {
    override fun invoke() {
        println("Executa invoke do Teste")
    }

}