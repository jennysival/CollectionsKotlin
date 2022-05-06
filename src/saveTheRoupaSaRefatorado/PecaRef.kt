package saveTheRoupaSaRefatorado

abstract class PecaRef(val tipoDePeca: String) {
    var marca: String = ""
    var modelo: String = ""

    open fun guardar(){
        print("Digite a marca de ${tipoDePeca}: ")
        marca = readln()
        print("Digite o modelo de ${tipoDePeca}: ")
        modelo = readln()
    }

    open fun retirada(){
        println("---------------------------------------------------------")
        println("$modelo de $marca retirado do guarda-volumes com sucesso!")
    }

}