package objetosCores
//Criar um dicionário que represente os objetos e suas cores. Para isso,
//o dicionário deverá ter como chave String e como valor uma lista de
//Strings.
//Exemplo dos valores:
//bola -> azul
//boneca -> amarela
//dado -> rosa
//
//Em seguida crie um arquivo com seu método main, imprimir no
//Main todas as chaves junto com seus valores associados. Para isso,
//utilizar o foreach com as chaves.

const val BOLA = "Bola"
const val BONECA = "Boneca"
const val DADO = "Dado"

class Objetos {

    val dicionarioObjetos = mapOf(
        BOLA to "Azul",
        BONECA to "Amarela",
        DADO to "Dado"
    )

}