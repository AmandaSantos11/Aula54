package ex8

fun main() {
    val funcionarioEncontrado = Funcionario.bucarFuncionario("Joao", Funcionario.cargosFuncionarios())

    if (funcionarioEncontrado != null){
        println("Funcionario ${funcionarioEncontrado.nome}, cargo ${funcionarioEncontrado.cargo}")
    }else{
        println("Funcionario nao encontrado")
    }

}
