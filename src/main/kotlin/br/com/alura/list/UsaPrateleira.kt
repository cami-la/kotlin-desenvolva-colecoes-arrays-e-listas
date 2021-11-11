package br.com.alura.list

fun main() {
    val prateleira = Prateleira(genero = "Ficção Científica", livros = listaDeLivros)

    val porAutor = prateleira.organizarPorAutor()
    val porAnoDePublicacao = prateleira.organizaPorAnoDePublicacao()

    porAutor.imprimeComMarcadores()
    porAnoDePublicacao.imprimeComMarcadores()


}