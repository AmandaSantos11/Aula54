package ex8

class Funcionario(var nome: String, var cargo: String) {
    companion object {
        fun cargosFuncionarios(): ArrayList<Funcionario> {


            var cargo1 = Funcionario("Joao", "Operador jr")
            var cargo2 = Funcionario("Luiza", "Caixa")
            var cargo3 = Funcionario("Lucas", "Vendedor")
            var cargo4 = Funcionario("Ana", "Analista")
            var cargo5 = Funcionario("Marta", "Pasteleira")
            var cargo6 = Funcionario("Felipe", "Diretor")
            var cargos = arrayListOf<Funcionario>(cargo1, cargo2, cargo3, cargo4, cargo5, cargo6)
            return cargos


        }


        fun bucarFuncionario(nome: String, lista: ArrayList<Funcionario>): Funcionario? {
            for (funcionario in lista) {
                if (funcionario.nome == nome) {
                    return funcionario
                }
            }
            return null
        }
    }

}
