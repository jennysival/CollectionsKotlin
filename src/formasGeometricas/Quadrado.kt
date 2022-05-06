package formasGeometricas

class Quadrado(private val tamLado: Double): Quadrilateros(tamLado, tamLado, tamLado, tamLado) {

    override var area: Double = 0.0


    override fun calculoArea() {
        area = tamLado*tamLado
        println("Área = $area")
    }

    override fun exibirDados() {
        println("QUADRADO")
        println("Lado = $tamLado")
    }
}