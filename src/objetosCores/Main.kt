package objetosCores

fun main() {
    val objetos = Objetos()

    objetos.dicionarioObjetos.forEach { obj, cor ->
        println("$obj: $cor")
    }
}