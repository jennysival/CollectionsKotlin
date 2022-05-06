package saveTheRoupaSa

class GuardaVolumes {
    val dicionario = mutableMapOf<Int, ArrayList<Peca>>()
    var contador: Int = 100

    fun guardarPecas(listaDePeca: ArrayList<Peca>): Int {
        contador += 1
        dicionario[contador] = listaDePeca
        return contador
    }

    fun mostrarPecas(){
            dicionario.forEach { (t, u) ->
                println("------------------------")
                println("Referência: $t")
                u.forEach {
                    println("Tipo: ${it.tipoDePeca}")
                    println("Marca: ${it.marca}")
                    println("Modelo: ${it.modelo}")
                }
            }
        }

    fun mostrarPecas(numero: Int){
        println("--- R E S U L T A D O ---")
        dicionario[numero]?.forEach {
            println("Tipo: ${it.tipoDePeca}")
            println("Marca: ${it.marca}")
            println("Modelo: ${it.modelo}")
        }
    }


    fun devolverPecas(numero: Int){
        dicionario.remove(numero)
    }

    }