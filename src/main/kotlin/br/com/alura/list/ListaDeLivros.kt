package br.com.alura.list

fun main() {

    val livro1 = Livro(
        titulo = "Matéria Escura",
        autor = "Blake Crouch",
        anoPublicacao = 2016,
    )


    val livro2 = Livro(
        titulo = "Recursão",
        autor = "Blake Crouch",
        anoPublicacao = 2019,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Pines",
        autor = "Blake Crouch",
        anoPublicacao = 2019,
    )

    val livro4 = Livro(
        titulo = "Memórias de uma Gueixa",
        autor = "Arthur Golden",
        anoPublicacao = 1998,
        editora = "Editora B"
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1946
        )
    )

    println(livros);
    //livros.remove(livro1);

    livros.imprimeComMarcadores();

    val ordenadoAnoPublicacao: List<Livro> = livros.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores();

    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    livros.sortedBy { it.autor }.imprimeComMarcadores();

    val titulos = livros
        .filter { it.autor.startsWith("Blake") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }
    println(titulos)

}

