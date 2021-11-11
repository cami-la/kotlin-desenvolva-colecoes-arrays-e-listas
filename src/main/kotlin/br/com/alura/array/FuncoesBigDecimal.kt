package br.com.alura.array

import java.math.BigDecimal

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce{ acumulador, valor -> acumulador + valor}
}

fun Array<BigDecimal>.media() : BigDecimal {
    return if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()
}