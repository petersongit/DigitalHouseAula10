package br.com.digitalhouse.aula10_4

fun main() {

    val listaFuncionarios = mutableListOf<Funcionario>(Funcionario("Aline", 1), Funcionario("Marina", 2), Funcionario("Peterson", 3), Funcionario("Marilia", 4))

    val funcionarioNovo = Funcionario("Joao", 2)

    println("Ja existe aluno de numero ${funcionarioNovo.numeroDeRegistro}?")
    println(listaFuncionarios.contains(funcionarioNovo))

    //Antes de sobrescrever retornou false, após sobrescrever método equals na classe Funcionario, retornou true.

}