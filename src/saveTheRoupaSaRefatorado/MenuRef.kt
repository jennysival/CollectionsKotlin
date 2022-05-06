package saveTheRoupaSaRefatorado

import kotlin.system.exitProcess

class MenuRef {

    private val guardaVolumes = GuardaVolumesRef()

    fun guardarOuRetirar(){
        println("------------------------------------------------")
        println("O que deseja fazer?")
        println("[1] Guardar")
        println("[2] Mostrar")
        println("[3] Retirar")
        println("[4] Sair")
        print("Digite o nº da opção escolhida: ")
        when(readln().toInt()){
            1 -> {
                guardaVolumes.escolherTipoDePeca()
                novaPeca()
            }
            2 -> {
                if(guardaVolumes.dicionario.isEmpty()){
                    println("------------------------------------------------")
                    println("         * O Guarda-volumes está vazio *        ")
                    guardarOuRetirar()
                }
                else{
                    guardaVolumes.mostrarPecas()
                    guardarOuRetirar()
                }
            }
            3 -> {
                if(guardaVolumes.dicionario.isEmpty()){
                    println("------------------------------------------------")
                    println("         * O Guarda-volumes está vazio *        ")
                    guardarOuRetirar()
                }
                else{
                    guardaVolumes.retirada()
                    guardarOuRetirar()
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

    private fun novaPeca(){
        println("------------------------------------------------")
        println("Deseja guardar uma nova peça? ")
        println("[1] SIM")
        println("[2] NÃO")
        print("Digite o nº da opção escolhida: ")
        when(readln().toInt()){
            1 -> {
                guardaVolumes.escolherTipoDePeca()
                novaPeca()
            }
            2 -> {
                guardarOuRetirar()
            }
            else -> {
                println("------------------------------------------------")
                println("              * Comando inválido *              ")
                novaPeca()
            }
        }
    }
}