package br.com.alura.array

fun main() {

    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)

    val maiorIdade = idades.maxOrNull()

    val menorIdade = idades.minOrNull()

    val mediaIdades: Double = idades.average()

    val todosMaiores = idades.all { it >= 18 }

    val existeMaior = idades.any { it >= 1 }

    val maioresDeIdade = idades.filter { it >= 18 }

    val primeiroValorIgual18 = idades.filter { it == 18 }

    println("A maior idade é: ${maiorIdade}")
    println("A menor idade é: ${menorIdade}")
    println("A menor idade é: ${mediaIdades}")
    println("Todos são maior de idade: ${todosMaiores}")
    println("Algum aluno é maior de idade: ${existeMaior}")
    println("Maiores: ${maioresDeIdade}")
    println("Primeiro valor encontrado igual a 18: ${primeiroValorIgual18}")


}
