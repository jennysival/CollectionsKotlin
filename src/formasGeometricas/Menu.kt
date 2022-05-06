package formasGeometricas

class Menu {

    private var validarOpc = 0
    set(value) {
        if(value in 1..3){
            field = value
        }
        else{
            opcInvalida()
        }
    }

    private fun lerOpc(){
        validarOpc = readln().toInt()
    }

    private fun opcInvalida(){
        println("Opção inválida")
        print("Digite novamente: ")
        lerOpc()
    }

    fun menu(){
        println("Quantas formas deseja criar?: ")
        val qtdFormas = readln().toInt()

        val listaDeFormas = ArrayList<Forma>()

        for(i in 1..qtdFormas){
            println("Qual o tipo da ${i}ª forma?")
            println("[1] Quadrado")
            println("[2] Retângulo")
            println("[3] Círculo")
            lerOpc()
            when(validarOpc){
                1 -> listaDeFormas.add(criarQuadrado())
                2 -> listaDeFormas.add(criarRetangulo())
                3 -> listaDeFormas.add(criarCirculo())
                }
        }

        println("-----------------------------")
        println("FORMAS GEOMÉTRICAS INSERIDAS:")
        listaDeFormas.forEachIndexed { index, forma ->
            println("------------------")
            println("${index+1}ª forma:")
            forma.exibirDados()
            forma.calculoPerimetro()
            forma.calculoArea()
        }
    }

    private fun criarQuadrado(): Forma {
        print("Digite o valor do lado do quadrado: ")

        return Quadrado(readln().toDouble())
    }

    private fun criarRetangulo(): Forma {
        print("Digite o valor da base do retângulo: ")
        val base = readln().toDouble()

        print("Digite o valor da altura do retângulo: ")
        val altura = readln().toDouble()

        return Retangulo(base, altura)
    }

    private fun criarCirculo(): Forma {
        print("Digite o valor do raio do círculo: ")
        return Circulo(readln().toDouble())
    }

}