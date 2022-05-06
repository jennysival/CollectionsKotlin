package listaNumeros

fun main() {
    //Definir e inicializar uma nova lista vazia. Adicionar os seguintes
    //elementos à lista vazia: [1,5,5,6,7,8,8,8]. Imprimir o resultado na tela.

    val listaUm = mutableListOf<Int>()

    listaUm.add(1)
    listaUm.add(5)
    listaUm.add(5)
    listaUm.add(6)
    listaUm.add(7)
    listaUm.add(8)
    listaUm.add(8)
    listaUm.add(8)

    println("Primeira lista: ")
    println(listaUm)
    println("------------------------------------")

    //Definir e inicializar um novo conjunto vazio. Adicionar os seguintes
    //elementos ao conjunto vazio: {1,5,5,6,7,8,8,8}. Imprimir o resultado na
    //tela. Qual é a diferença entre este exercício e o anterior?

    val listaDois = mutableSetOf<Int>()

    listaDois.add(1)
    listaDois.add(5)
    listaDois.add(5)
    listaDois.add(6)
    listaDois.add(7)
    listaDois.add(8)
    listaDois.add(8)
    listaDois.add(8)

    println("Segunda Lista: ")
    println(listaDois)
    println("------------------------------------")

}

//A diferença é que no conjunto (2º exercício) usei SetOf, onde não é inserido os elementos repetidos (5, 8, 8)