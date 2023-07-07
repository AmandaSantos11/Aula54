package ex1

fun main(){

    println("Digite seu nome:")
    var nome = readln()
    println("Digite sua idade:")
    var idade = readln().toIntOrNull()

    val pessoa = Pessoa(nome, idade)

    pessoa.informacoes()
}