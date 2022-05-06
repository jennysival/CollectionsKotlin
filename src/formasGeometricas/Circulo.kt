package formasGeometricas

class Circulo(private val raio: Double): Forma {
    override var area: Double = 0.0
    override fun calculoPerimetro() {
        val perimetro = (2*3.14)*raio
        println("Perímetro = $perimetro")
    }

    override fun calculoArea() {
        area = (raio*raio)*3.14
        println("Área = $area")
    }

    override fun exibirDados() {
        println("CÍRCULO")
        println("Raio = $raio")
    }
}