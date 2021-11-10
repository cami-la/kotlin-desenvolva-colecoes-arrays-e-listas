package br.com.alura.array

fun main() {
    val serie: IntRange  = 1.rangeTo(10)

    for (s in serie) {
        print("$s")
    }
    println()

    val numerosParesExcluindo100 = 0.until(100) step 2
    for(numeroPar in numerosParesExcluindo100) print("$numeroPar ")
    println()
    val numerosParesIncluindo100 = 0..100 step 2
    for(numeroPar in numerosParesIncluindo100) print("$numeroPar ")
    println("\n------------")

    val numerosParesReversos = 100 downTo 0 step 2
    numerosParesReversos.forEach {print("$it ")}
    //    numerosParesReversos.forEach {numerosParReverso -> print("$numerosParReverso ")    }

    val intervalo = 1500.0..5000.0
    val salario: Double = 4000.0

    println()
    if (salario in intervalo) {
        println("Está dentro do intervalo")
    } else {
        println("Não está dentro do intervalo")
    }

    val alfabeto = 'a'..'z'
    var letra = 'K'
    println(letra in alfabeto)
}