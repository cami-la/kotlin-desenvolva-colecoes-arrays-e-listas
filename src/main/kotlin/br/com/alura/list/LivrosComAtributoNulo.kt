package br.com.alura.list

fun main() {
    listaDeLivros
        .groupBy { it.editora ?: "Editora desconhecida"}
        .forEach{(editora, livros) -> println("$editora: ${livros.joinToString { it.titulo }}")}
}