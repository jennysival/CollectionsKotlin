package saveTheRoupaSa

class Acessorio: Peca("Acessório") {

    override fun retirada() {
        println("------------------------------------------------")
        println("Acessório retirado do guarda-volumes com sucesso! ")
    }
}