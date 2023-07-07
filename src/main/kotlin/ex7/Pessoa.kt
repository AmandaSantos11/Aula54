package ex7

class Pessoa (var nome:String, var idade:String,var profissao:String){

    fun preencherDados(){
        while (nome.isNullOrBlank()){
            println("Nome inválido, digite novamente:")
            nome= readln()
        }
    }

    fun exibirInformacoes(){

        if(idade.isNullOrBlank()){
            idade = "Desconhecido"
        }
        if (profissao.isNullOrBlank()){
            profissao = "Desconhecido"
        }

        println("Nome: $nome\nIdade: $idade\nProfissão: $profissao")
    }
}