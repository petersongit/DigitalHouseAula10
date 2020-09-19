package br.com.digitalhouse.aula10_3

fun main() {

    val listaAlunos = mutableListOf<Aluno>(Aluno("Aline", 1),Aluno("Marina", 2), Aluno("Peterson", 3), Aluno("Marilia", 4))

    val alunoNovo = Aluno("Joao", 1)

    println("Ja existe aluno de numero ${alunoNovo.numeroDeAluno}?")
    println(listaAlunos.contains(alunoNovo))

    //Antes de sobrescrever retornou false, após sobrescrever método equals na classe Aluno, retornou true.

}