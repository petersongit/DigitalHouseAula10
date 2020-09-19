package br.com.digitalhouse.aula10_4

class Funcionario(var nome: String, var numeroDeRegistro: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Funcionario

        if (numeroDeRegistro != other.numeroDeRegistro) return false

        return true
    }
}