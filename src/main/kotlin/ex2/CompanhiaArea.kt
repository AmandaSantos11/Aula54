package ex2

class CompanhiaArea(var nome: String, var codigo: Int) {

    companion object {
        fun obterCompanhia(vetorCompanhias: Array<CompanhiaArea>) {
            println("Informe o código que deseja pesquisar: ")
            val cod = readln().toIntOrNull()
            if (cod != null) {
                for (i in vetorCompanhias) {
                    if (i.codigo == cod) {
                        println("Companhia Econtrada: ${i.nome}")
                       return
                    }
                    }
                }
            println("Companhia não encontrada")
            }
        }
    }
