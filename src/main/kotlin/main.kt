import MatheusADSantos.com.github.bytebank.modelo.Endereco
import MatheusADSantos.com.github.bytebank.teste.testaAny

fun main() {
    println("início main")
    funcao1()
    println("fim main")
}

fun funcao1(){
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        var endereco = Any()
        endereco as Endereco
    }
    println("fim funcao2")
}