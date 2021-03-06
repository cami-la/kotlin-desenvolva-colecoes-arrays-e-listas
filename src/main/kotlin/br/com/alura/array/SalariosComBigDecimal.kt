package br.com.alura.array

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salarios: Array<BigDecimal> = bigDecimalArrayOf("1500.55", "2000.0", "5000.00", "10000.00")

    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento)
        }.toTypedArray()
    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)

    var meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println(gastoTotal)

    val mediaTresMaioresSalarios = salariosComAumento
        .sortedArray()
        .takeLast(3)
        .toTypedArray()
        .media()
    println(mediaTresMaioresSalarios)

    val mediaTresMenoresSalarios = salariosComAumento
        .sortedArray()
        .take(3)
        .toTypedArray()
        .media()
    println(mediaTresMenoresSalarios)




}

private fun calculaAumentoRelativo(
    salario: BigDecimal,
    aumento: BigDecimal
) = if (salario < "5000.00".toBigDecimal())
    salario + ("500.0".toBigDecimal()).setScale(2, RoundingMode.UP)
else (salario * aumento).setScale(2, RoundingMode.UP)

