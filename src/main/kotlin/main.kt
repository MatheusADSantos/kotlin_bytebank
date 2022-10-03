import MatheusADSantos.com.github.bytebank.teste.testaExpressao

fun main() {

    testaTipoFuncaoReferencia()
    testaTipoFuncaoClasse()

//    val minhaFuncaoLambda: () -> Unit = {
//        println("Executa como LAMBDA")
//    }
//    println(minhaFuncaoLambda())
//
//    val minhaFuncaoAnonima: () -> Unit = fun() {
//        println("Executa como ANONIMA")
//    }
//    println(minhaFuncaoAnonima())

}

private fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasse(5, 20))
}

private fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int,  b: Int): Int = a + b


}