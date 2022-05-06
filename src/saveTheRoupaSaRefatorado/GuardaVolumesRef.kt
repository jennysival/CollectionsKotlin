package saveTheRoupaSaRefatorado

class GuardaVolumesRef {
    val dicionario = mutableMapOf<Int, ArrayList<PecaRef>>()
    var contador: Int = 100

    fun escolherTipoDePeca(){
        println("------------------------------------------------")
        println("Qual tipo de peça deseja guardar?")
        println("[1] Roupa")
        println("[2] Calçado")
        println("[3] Acessório")
        print("Digite o nº da opção escolhida: ")
        when(readln().toInt()){
            1 -> {
                val novaRoupa: PecaRef = RoupaRef()
                guardarPeca(novaRoupa)
            }
            2 -> {
                val novoCalcado: PecaRef = CalcadoRef()
                guardarPeca(novoCalcado)
            }
            3 -> {
                val novoAcessorio: PecaRef = AcessorioRef()
                guardarPeca(novoAcessorio)
            }
            else -> {
                println("------------------------------------------------")
                println("              * Comando inválido *              ")
                escolherTipoDePeca()
            }
        }
    }

    fun inserirPeca(listaDePeca: ArrayList<PecaRef>): Int {
        contador += 1
        dicionario[contador] = listaDePeca
        return contador
    }

    fun guardarPeca(peca: PecaRef){
        val listaDePecas = ArrayList<PecaRef>()
        peca.guardar()
        listaDePecas.add(peca)
        inserirPeca(listaDePecas)
        println("A referência da peça guardada é: $contador")
    }

    fun exibirPecas(){
            dicionario.forEach { (chave, lista) ->
                println("------------------------")
                println("Referência: $chave")
                lista.forEach {
                    println("Tipo: ${it.tipoDePeca}")
                    println("Marca: ${it.marca}")
                    println("Modelo: ${it.modelo}")
                }
            }
        }

    fun exibirPecas(numero: Int){
        println("--- R E S U L T A D O ---")
        dicionario[numero]?.forEach {
            println("Tipo: ${it.tipoDePeca}")
            println("Marca: ${it.marca}")
            println("Modelo: ${it.modelo}")
        }
    }

    fun mostrarPecas(){
        println("------------------------------------------------")
        println("[1] Buscar única peça")
        println("[2] Mostrar todas as peças")
        print("Digite o nº da opção escolhida: ")
        when(readln().toInt()){
            1 -> {
                println("------------------------------------------------")
                print("Digite a referência da peça guardada: ")
                val refDigitada = readln().toInt()

                if (refDigitada in dicionario) {
                    exibirPecas(refDigitada)
                } else {
                    println("------------------------------------------------")
                    println("  * Não há peças guardadas nesta referência! *  ")
                    mostrarPecas()
                }
            }

            2 ->{
                exibirPecas()
            }
            else -> {
                println("------------------------------------------------")
                println("              * Comando inválido *              ")
                mostrarPecas()
            }
        }

    }


    fun devolverPecas(numero: Int){
        dicionario.remove(numero)
    }

    fun retirada(){
        println("------------------------------------------------")
        print("Digite a referência da peça que deseja retirar: ")
        val codigoDigitado = readln().toInt()

        if(codigoDigitado in dicionario){
            dicionario[codigoDigitado]?.forEach {
                it.retirada()
            }
            devolverPecas(codigoDigitado)
        }
        else{
            println("------------------------------------------------")
            println("  * Não há peças guardadas nesta referência! *  ")
        }
    }

    }