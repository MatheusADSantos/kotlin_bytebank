package MatheusADSantos.com.github.bytebank.teste

fun testaFuncaoAnonima() {
    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50
        }
        return salario + 100.0
    }
    println(calculaBonificacaoAnonima(1100.0))

    val minhaFuncaoAnonima = fun(a: Int, b: Int): Int {
        println("Executa como ANONIMA")
        return a + b
    }
    println(minhaFuncaoAnonima(10, 20))
}


fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasse(5, 20))
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int,  b: Int): Int = a + b

}