package exc1

class Curso(var nome: String, val professor: Professor) {
    val listaAula = mutableListOf<Aula>()
    val listaAlunos = mutableListOf<Aluno>()
}