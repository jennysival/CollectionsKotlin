package saveTheRoupaSa

class Roupa: Peca("Roupa") {
    override fun retirada() {
        println("------------------------------------------------")
        println("  Roupa retirada do guarda-volumes com sucesso! ")
    }
}