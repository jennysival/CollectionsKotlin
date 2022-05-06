package saveTheRoupaSa

abstract class Peca(val tipoDePeca: String) {
    var marca: String = ""
    var modelo: String = ""

    open fun guardar(){
        print("Digite a marca de ${tipoDePeca}: ")
        marca = readln()
        print("Digite o modelo de ${tipoDePeca}: ")
        modelo = readln()
    }

    abstract fun retirada()

}