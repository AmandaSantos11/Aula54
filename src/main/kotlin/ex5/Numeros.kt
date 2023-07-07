package ex5

class Numeros {
    fun qtaNumeros(){
        println("Digite a quantidade de numeros que você deseja adicionar: ")
        val qta = readln()?.toIntOrNull()
        if (qta != null && qta > 0) {
            var listaNumeros = ArrayList<Int>()
            for (i in 1..qta) {
                println("Digite um valor inteiro: ")
                listaNumeros.add(readln().toIntOrNull() ?: 0)
            }
            val resultado = somaValores(listaNumeros)
            println("A soma dos valores não nulos é: $resultado")
        }else{
            println("Quantidade invalida")
        }
    }

    fun somaValores(listaInteiros: ArrayList<Int>): Int {
        var somaValores = 0
        for (i in listaInteiros) {
            if (i != null) {
                somaValores += i
            }
        }
        return somaValores
    }
}