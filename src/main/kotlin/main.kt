import MatheusADSantos.com.github.bytebank.teste.testaExpressao

fun main() {

//    testaTipoFuncaoReferencia()
//    testaTipoFuncaoClasse()

    val minhaFuncaoLambda: () -> Unit = {
        println("Executa como LAMBDA")
    }
    println(minhaFuncaoLambda())

    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("Executa como ANONIMA")
    }
    println(minhaFuncaoAnonima())

}

private fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse = ::Teste
    println(minhaFuncaoClasse())
}

private fun testaTipoFuncaoReferencia() {
    val minhaFuncao = ::teste
    println(minhaFuncao())
}

fun teste() {
    println("Executa teste")
}

class Teste {
    operator fun invoke() {
        println("Executa invoke do Teste")
    }

}