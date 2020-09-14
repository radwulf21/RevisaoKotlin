package exc1

<<<<<<< HEAD
class Curso(var nome: String, val profResponsavel: Professor) {
=======
class Curso(var nome: String, val professor: Professor) {
>>>>>>> 2f5b1e536ff4c26aeaf9cfb038e537ffec0eade1
    val listaAula = mutableListOf<Aula>()
    val listaAlunos = mutableListOf<Aluno>()

    fun adicionarAluno(vararg alunos: Aluno) = alunos.forEach { listaAlunos.add(it) }
    fun adicionarAula(vararg aulas: Aula) = aulas.forEach { listaAula.add(it) }
}