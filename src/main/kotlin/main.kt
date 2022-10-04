import MatheusADSantos.com.github.bytebank.teste.testaExpressao

fun main() {

//    testaTipoFuncaoReferencia()
//    testaTipoFuncaoClasse()

//    val minhaFuncaoLambda = { a: Int, b: Int -> Int
//        println("Executa como LAMBDA")
//        a + b
//    }
//    println(minhaFuncaoLambda(20, 15))

//    val minhaFuncaoAnonima= fun(a: Int, b: Int): Int {
//        println("Executa como ANONIMA")
//        return a + b
//    }
//    println(minhaFuncaoAnonima(10, 20))

    val calculaBonificacao: (salario: Double) -> Double = lambda@{salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50
        } else {
            salario+ 100.0
        }
    }
    println(calculaBonificacao(1500.0))

    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if(salario > 1000.0){
            return salario + 50
        }
        return salario + 100.0
    }
    println(calculaBonificacaoAnonima(1100.0))


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