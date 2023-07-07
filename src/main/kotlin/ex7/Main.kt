package ex7

fun main(){

    for (i in 1..3){
        println("Digite seu nome:")
        var nome = readln()
        println("Digite sua idade:")
        var idade = readln()
        println("Digite sua profissão:")
        var profissao = readln()

        var pessoa = Pessoa(nome,idade,profissao)
        pessoa.preencherDados()
        pessoa.exibirInformacoes()
        println()
    }
}
