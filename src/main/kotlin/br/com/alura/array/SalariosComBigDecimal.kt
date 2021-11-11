package br.com.alura.array

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salarios: Array<BigDecimal> = bigDecimalArrayOf("1500.55", "2000.0", "5000.00", "10000.00")

    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento = salarios
        .map { salario ->
            if (salario < "5000.00".toBigDecimal())
                salario + ("500.0".toBigDecimal()).setScale(2, RoundingMode.UP)
            else (salario * aumento).setScale(2, RoundingMode.UP)
        }.toTypedArray()


    println(salariosComAumento.contentToString())
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}