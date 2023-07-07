# Aula54
<hr>

## Os exercícios postados nesse repositório foram feitos a fim de fixar os conhecimentos sobre Nullable em Kotlin.
<hr>

## DESENVOLVEDORAS:

- [Amanda Santos](https://github.com/AmandaSantos11)
- [Laura Xavier](https://github.com/laura-chagas)
- [Milena Alcântara](https://github.com/Milena-Alcantara)
- [Thalia Lopes](https://github.com/Thalia-guedes)
- [Vitoria Cerqueira](https://github.com/Vitoria-Cerqueira)

### Exercicios: GRUPO 2

1. Crie uma classe Pessoa que irá representar uma pessoa com os seguintes atributos (nome, idade).
- Garanta que o atributo nome não seja null.
- O atributo Idade deve ser null e deve ter um tratamento para ele.
- Crie os métodos informações, que deve printar o nome e a idade do usuário.
- Crie também o método maiorDeIdade, que deve verificar se o usuario é maior de idade ou não e printar “É maior de idade: X” sendo X true ou false.
- Na main, peça para o usuario informar o nome e a idade, chame o metodo de informar e o método maiorDeIdade.

2. Crie uma classe chamada 'CompanhiaAerea' com os atributos 'nome' e 'codigo'.
- Crie um vetor e adicione nome e códigos de companhias aéreas.
- Implemente uma função chamada 'obterCompanhia' que recebe um código da companhia aérea e retorna uma instância de 'CompanhiaAerea' correspondente.
- Caso o código não seja válido, não esteja associado a nenhuma companhia ou for null, a função deve retornar a seguinte mensagem: "Companhia não encontrada para o código X" sendo X o código digitado.

3. Desenvolva um programa que permita ao usuário criar uma lista de compras. O programa começará solicitando ao usuário que digite a quantidade de itens que deseja adicionar à lista. Essa quantidade será armazenada em uma variável.
- Caso o valor digitado não seja um número válido ou seja null, a quantidade será considerada como zero.
- Após inserir a quantidade o programa deverá permitir que o usuário insira os produtos nessa lista.
- No final deverá ser mostrado todos os itens da lista, incluindo o que o usuário registrar como null

4. Escreva um programa que solicite ao usuário a quantidade de alunos e, em seguida, leia os nomes e as notas dos alunos.
- Para cada aluno, o programa deve permitir que o usuário digite o nome e a nota correspondente.
- Caso o usuário deixe em branco a nota do aluno, ela será considerada como não lançada.
- Após a leitura dos dados, o programa deve separar os alunos em duas listas: uma lista para os alunos sem notas lançadas e outra lista para os alunos com notas lançadas.
- Em seguida, o programa deve exibir na tela os seguintes resultados:
- Os alunos sem notas lançadas, mostrando seus respectivos nomes.
- Caso não haja nenhum aluno sem nota lançada, exiba a mensagem "Nenhum aluno sem nota lançada.".
- Os alunos com notas lançadas, mostrando seus respectivos nomes.

### Exercicios: GRUPO 1

5. Faça uma função que recebe uma lista de inteiros, que podem ser nulos, e
   retorne a soma dos valores que não são nulos. Mostre o seu funcionamento
   na main.

6. Crie um programa que solicite ao usuário um endereço de e-mail e verifique
   se ele é válido. O programa deve lidar com a possibilidade de o usuário não
   fornecer um valor para o e-mail.

7. Crie uma classe chamada Pessoa que represente uma pessoa que possua
   os atributos nome, idade e profissão. Crie um método chamado
   preencherDados que realiza leitura dos atributos. Caso o nome seja nulo,
   permita que a pessoa digite o nome novamente. Faça um método chamado
   exibirInformacoes que substitua os possíveis valores nulos(idade e profissão)
   por “DESCONHECIDO”. Na main, crie pelo menos 3 pessoas e use os
   métodos criados em Pessoa.

8. Crie uma classe Funcionários que obedeça a descrição abaixo:
   a. A classe possui os atributos nome e cargo;
   b. Crie uma lista de funcionários dentro da classe com 6 funcionários;
   c. Crie um método chamado buscarFuncionario que receba um
   nome.Caso o funcionário não exista retorne null.Se existir, retorne o
   funcionário associado aquele nome.
   Na Main crie uma variável chamada funcionário e use o método
   buscarFuncionario. Se a função retornar null imprima na tela “Funcionário
   não encontrado”, senão imprima “Funcionário encontrado! Nome: x e Cargo:
   y”.
