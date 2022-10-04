package MatheusADSantos.com.github.bytebank.teste

fun testaFuncaoLambda() {
    val minhaFuncaoLambda = { a: Int, b: Int ->
        Int
        println("Executa como LAMBDA")
        a + b
    }
    println(minhaFuncaoLambda(20, 15))


    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50
        } else {
            salario + 100.0
        }
    }
    println(calculaBonificacao(1500.0))
}

