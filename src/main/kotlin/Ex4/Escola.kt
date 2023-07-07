package Ex4

fun main() {
   Escola().receberQuantidadeDeAlunos()
}

class Escola {

    fun receberQuantidadeDeAlunos() {
        println("Digite a quantidade de alunos:")
        val qtd = readln().toInt()

        receberNomeNotaDosAlunos(qtd)
    }

    fun receberNomeNotaDosAlunos(qtd: Int) {
        var arrayAlunosComNota = ArrayList<Aluno>()
        var arrayAlunosSemNota = ArrayList<Aluno>()
        var nome: String
        for (i in 1..qtd) {
            do {
                println("Digite o nome do $i aluno(a):")
                nome = readln()
            } while (nome.isNullOrBlank())

            println("Digite a nota:")
            var nota = readln().toDoubleOrNull() ?: 0.0
            if (nota == 0.0) {
                arrayAlunosSemNota.add(Aluno(nome, nota))
            } else {
                arrayAlunosComNota.add(Aluno(nome, nota))
            }
        }

        mostrarListasDeAlunos(arrayAlunosComNota, arrayAlunosSemNota)
    }

    fun mostrarListasDeAlunos(arrayAlunoComNota: ArrayList<Aluno>, arrayAlunoSemNota: ArrayList<Aluno>) {

        if (arrayAlunoComNota.size == 0) {
            println("\nNENHUM ALUNO COM NOTA LANÇADA")
        }
        else{
            println("------LISTA DE ALUNOS COM NOTAS LANÇADAS------")
            for (i in arrayAlunoComNota) {
                println("Nome: ${i.nomeAluno} | Nota: ${i.notaAluno}")
            }
        }
        if (arrayAlunoSemNota.size == 0) {
            println("\nNENHUM ALUNO SEM NOTA LANÇADA")
        } else {
            println("\n------LISTA DE ALUNOS SEM NOTAS LANÇADAS------")
            for (i in arrayAlunoSemNota) {
                println("Nome: ${i.nomeAluno} | Nota: ${i.notaAluno}")
            }
        }

    }
}

