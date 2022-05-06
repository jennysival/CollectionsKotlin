package saveTheRoupaSa

import kotlin.system.exitProcess

class Menu {

    private val guardaVolumes = GuardaVolumes()

    fun guardarOuRetirar(){
        println("------------------------------------------------")
        println("O que deseja fazer?")
        println("[1] Guardar")
        println("[2] Mostrar")
        println("[3] Retirar")
        println("[4] Sair")
        print("Digite o nº da opção escolhida: ")
        when(readln().toInt()){
            1 -> escolherTipoDePeca()
            2 -> {
                if(guardaVolumes.dicionario.isEmpty()){
                    println("------------------------------------------------")
                    println("         * O Guarda-volumes está vazio *        ")
                    guardarOuRetirar()
                }
                else{
                    mostrarPecas()
                }
            }
            3 -> {
                if(guardaVolumes.dicionario.isEmpty()){
                    println("------------------------------------------------")
                    println("         * O Guarda-volumes está vazio *        ")
                    guardarOuRetirar()
                }
                else{
                    menuRetirada()
                }
            }
            4 -> exitProcess(0)
            else -> {
                println("------------------------------------------------")
                println("              * Comando inválido *              ")
                guardarOuRetirar()
            }
        }
    }

    private fun escolherTipoDePeca(){
        println("------------------------------------------------")
        println("Qual tipo de peça deseja guardar?")
        println("[1] Roupa")
        println("[2] Calçado")
        println("[3] Acessório")
        print("Digite o nº da opção escolhida: ")
        when(readln().toInt()){
            1 -> {
                val novaRoupa: Peca = Roupa()
                guardarPeca(novaRoupa)
                novaPeca()

            }
            2 -> {
                val novoCalcado: Peca = Calcado()
                guardarPeca(novoCalcado)
                novaPeca()

            }
            3 -> {
                val novoAcessorio: Peca = Acessorio()
                guardarPeca(novoAcessorio)
                novaPeca()

            }
            else -> {
                println("------------------------------------------------")
                println("              * Comando inválido *              ")
                escolherTipoDePeca()
            }
        }
    }

    private fun guardarPeca(peca: Peca){
        val listaDePecas = ArrayList<Peca>()
        peca.guardar()
        listaDePecas.add(peca)
        guardaVolumes.guardarPecas(listaDePecas)
        println("A referência da peça guardada é: ${guardaVolumes.contador}")
    }

    private fun novaPeca(){
        println("------------------------------------------------")
        println("Deseja guardar uma nova peça? ")
        println("[1] SIM")
        println("[2] NÃO")
        print("Digite o nº da opção escolhida: ")
        when(readln().toInt()){
            1 -> escolherTipoDePeca()
            2 -> guardarOuRetirar()
            else -> {
                println("------------------------------------------------")
                println("              * Comando inválido *              ")
                novaPeca()
            }
        }
    }

    private fun mostrarPecas(){
        println("------------------------------------------------")
        println("[1] Buscar única peça")
        println("[2] Mostrar todas as peças")
        print("Digite o nº da opção escolhida: ")
        when(readln().toInt()){
            1 -> {
                println("------------------------------------------------")
                print("Digite a referência da peça guardada: ")
                val refDigitada = readln().toInt()

                if (refDigitada in guardaVolumes.dicionario) {
                    guardaVolumes.mostrarPecas(refDigitada)
                    guardarOuRetirar()
                } else {
                    println("------------------------------------------------")
                    println("  * Não há peças guardadas nesta referência! *  ")
                    mostrarPecas()
                }
            }

            2 ->{
                guardaVolumes.mostrarPecas()
                guardarOuRetirar()
            }
            else -> {
                println("------------------------------------------------")
                println("              * Comando inválido *              ")
                mostrarPecas()
            }
        }

    }

    private fun menuRetirada(){
        println("------------------------------------------------")
        print("Digite a referência da peça que deseja retirar: ")
        val codigoDigitado = readln().toInt()

        if(codigoDigitado in guardaVolumes.dicionario){
            guardaVolumes.dicionario[codigoDigitado]?.forEach {
                it.retirada()
            }
            guardaVolumes.devolverPecas(codigoDigitado)
            guardarOuRetirar()
        }
        else{
            println("------------------------------------------------")
            println("  * Não há peças guardadas nesta referência! *  ")
            guardarOuRetirar()
        }
    }

}