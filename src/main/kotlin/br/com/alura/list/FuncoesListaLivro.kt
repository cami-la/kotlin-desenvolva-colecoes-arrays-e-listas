package br.com.alura.list

fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor} - ${it.anoPublicacao}"
    }
    println("--- Lista de livros --- \n$textoFormatado")
}