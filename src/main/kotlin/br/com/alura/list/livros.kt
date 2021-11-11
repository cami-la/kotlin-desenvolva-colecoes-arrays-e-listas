package br.com.alura.list

val listaDeLivros: MutableList<Livro> = mutableListOf(
    Livro(
        titulo = "Matéria Escura",
        autor = "Blake Crouch",
        anoPublicacao = 2016,
    ),
    Livro(
        titulo = "Recursão",
        autor = "Blake Crouch",
        anoPublicacao = 2019,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Pines",
        autor = "Blake Crouch",
        anoPublicacao = 2019,
    ),
    Livro(
        titulo = "Memórias de uma Gueixa",
        autor = "Arthur Golden",
        anoPublicacao = 2028,
        editora = "Editora B"
    )
)

val listaDeLivrosComNulos: MutableList<Livro?> = mutableListOf(
    null,
    Livro(
        titulo = "Matéria Escura",
        autor = "Blake Crouch",
        anoPublicacao = 2016,
    ),
    null,
    Livro(
        titulo = "Recursão",
        autor = "Blake Crouch",
        anoPublicacao = 2019,
        editora = "Editora A"
    ),
    null,
    Livro(
        titulo = "Pines",
        autor = "Blake Crouch",
        anoPublicacao = 2019,
    ),
    null,
    Livro(
        titulo = "Memórias de uma Gueixa",
        autor = "Arthur Golden",
        anoPublicacao = 2028,
        editora = "Editora B"
    )

)