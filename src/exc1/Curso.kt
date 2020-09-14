package exc1

class Curso(var nome: String, val profResponsavel: Professor) {
    val listaAula = mutableListOf<Aula>()
    val listaAlunos = mutableListOf<Aluno>()

    fun adicionarAluno(vararg alunos: Aluno) = alunos.forEach { listaAlunos.add(it) }
    fun adicionarAula(vararg aulas: Aula) = aulas.forEach { listaAula.add(it) }
}