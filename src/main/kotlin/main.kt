import MatheusADSantos.com.github.bytebank.modelo.Endereco

fun main() {
// Acessando atributo de um objeto → Ex1 MELHOR
    var endereco: Endereco? = null
    endereco?.logradouro

// Ex2
    var endereco2: Endereco? = null
    if (endereco2 != null) {
        endereco2.logradouro
    }

// Ex3 PIOR -> Aqui crasheia o app
    var endereco3: Endereco? = null
    endereco3!!.logradouro
}