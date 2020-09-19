package br.com.digitalhouse.aula10_2

fun main() {

    val coca1 = Coca(1, 3.00)
    val coca2 = Coca(1, 3.50)

    println(coca1.equals(coca2))

    // O metodo original "equals" comparou tanto o tamanho quanto o preço e retornou false
    // Após sobrescrever, retornou true pois comparou apenas o tamanho

}