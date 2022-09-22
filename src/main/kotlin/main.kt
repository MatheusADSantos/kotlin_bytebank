import MatheusADSantos.com.github.bytebank.modelo.Endereco
import MatheusADSantos.com.github.bytebank.teste.testaAny
import java.lang.ClassCastException

fun main() {
    println("início main")
    funcao1()
    println("fim main")
}

fun funcao1(){
    println("início funcao1")
    try {
        funcao2()
    } catch (e: ClassCastException) {
        println("ClassCastException pega!!!")
    }
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