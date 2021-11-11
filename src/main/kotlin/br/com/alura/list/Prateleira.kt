package br.com.alura.list

data class Prateleira(
    val genero: String,
    val livros: List<Livro>
) {

    fun organizarPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }

    }

    fun organizaPorAnoDePublicacao(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }
    }
}