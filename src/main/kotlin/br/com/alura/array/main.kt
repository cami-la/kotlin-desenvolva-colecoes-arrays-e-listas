package br.com.alura.array

import java.math.BigDecimal

fun main() {

    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55)
    /*val idade1 = 25
    val idade2 = 19
    val idade3 = 33
    val idade4 = 20*/

    /*val maiorIdade = if (idade1 > idade2 && idade1 > idade3) {
        idade1
    } else if (idade2 > idade3) {
        idade2
    } else {
        idade3
    }
    println(maiorIdade)*/

    /*val maiorIdade2 = when {
        (idade1 > idade2 && idade1 > idade3 && idade1 > idade4) -> idade1
        (idade2 > idade3 && idade2 > idade4) -> idade2
        (idade3 > idade4) -> idade3
        else -> idade4
    }
    println(maiorIdade2)*/

    /*val idades: IntArray = IntArray(5)
       idades[0] = 25
       idades[1] = 19
       idades[2] = 33
       idades[3] = 20
       idades[4] = 55*/

    /*var maiorIdade: Int = Int.MIN_VALUE;
    var menorIdade: Int = Int.MAX_VALUE;

    for (idade in idades) {
        if (idade > maiorIdade) maiorIdade = idade;
    }

    idades.forEach { idade ->
        if (idade > maiorIdade) maiorIdade = idade;
    }
    println(maiorIdade)

    idades.forEach { idade ->
        if (idade < menorIdade) menorIdade = idade;
    }
    println(menorIdade);*/

    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 10000.0)

    val aumento: Double = 1.1

    /*var indice: Int = 0
    for(salario in salarios) {
        salarios[indice] = salario * aumento
        indice++
    }*/

    /*for(indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }*/

    /*println(salarios.contentToString())
    salarios.forEachIndexed {i, salario ->
        salarios[i] = salario * aumento
    }
    println(salarios.contentToString())*/
}
