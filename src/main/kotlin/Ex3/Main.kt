package Ex3

fun main() {
    Produto().solicitarProdutos()
}

class Produto{
    fun solicitarProdutos(){
        println("Informe a quantidade de produtos: ")
        var qt = readln().toIntOrNull() ?: 0
        var produtos = ArrayList<String>()

        for (i in 0..qt){
            println("Digite o produto: ")
            var nomeProduto = readlnOrNull()
            if (nomeProduto.isNullOrBlank()){
                nomeProduto = "null"
            }
            produtos.add(nomeProduto)
        }
        mostarLista(produtos)
    }
    fun mostarLista(lista: ArrayList<String>){
        println("----------------Lista de Compras-----------------")
        for (item in lista){
            println(item)
        }
    }
}