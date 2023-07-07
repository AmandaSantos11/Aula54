package ex1

class Pessoa (var nome:String?, var idade:Int?){

    fun informacoes(){
        while (nome.isNullOrBlank()){
            println("O nome não pode ser vazio, digite novamente:")
            nome= readln()
        }

        while (idade==null){
            println("A idade não pode ser vazio, digite novamente:")
            idade= readln().toIntOrNull()
        }
        println("Nome: $nome\nIdade: $idade")
        maiorDeIdade(idade)
    }

    fun maiorDeIdade(idade:Int?){
        var maiorIdade = if (idade!! >= 18) true else false
        println("É maior de idade: $maiorIdade")
    }
}