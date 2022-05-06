package formasGeometricas

abstract class Quadrilateros(private val ladoUm: Double,
                             private val ladoDois: Double,
                             private val ladoTres: Double,
                             private val ladoQuatro: Double): Forma {

    override fun calculoPerimetro() {
        val perimetro = ladoUm+ladoDois+ladoTres+ladoQuatro
        println("Perímetro = $perimetro")
    }

}