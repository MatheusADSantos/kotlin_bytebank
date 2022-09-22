fun main() {
    println("início main")
    testaComportamentosConta()
    println("fim main")
}



fun funcao1(){
    println("início funcao1")
    try {
        funcao2()
    } catch (e: ClassCastException) {
        println("ClassCastException pega!!!")
        println(e.message) // Retorna a mensagem do erro
        println(e.printStackTrace()) // Ao final do código ele retorna o tipo/mensagem rastreio da pilha ...
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        var endereco = Any()
//        throw ClassCastException()
//        throw ArithmeticException()
        throw NumberFormatException()
    }
    println("fim funcao2")
}