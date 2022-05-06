package formasGeometricas

class Retangulo(private val base: Double, private val altura: Double): Quadrilateros(base, base, altura, altura) {
    override var area: Double = 0.0
    override fun calculoArea() {
        area = base*altura
        println("Área = $area")
    }

    override fun exibirDados() {
        println("RETÂNGULO")
        println("Base = $base")
        println("Altura = $altura")
    }
}