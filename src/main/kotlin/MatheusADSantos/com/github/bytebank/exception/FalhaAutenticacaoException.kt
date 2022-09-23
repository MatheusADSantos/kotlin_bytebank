package MatheusADSantos.com.github.bytebank.exception

import java.lang.Exception

class FalhaAutenticacaoException(
    mensage: String = "Falha na Autenticação"
) : Exception(mensage) {

}
