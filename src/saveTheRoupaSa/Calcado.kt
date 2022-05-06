package saveTheRoupaSa

class Calcado: Peca("Calçado") {
    override fun retirada() {
        println("------------------------------------------------")
        println(" Calçado retirado do guarda-volumes com sucesso!")
    }
}