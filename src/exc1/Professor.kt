package exc1

class Professor(var nome: String, var registroDocente: Int) : Docente {
    override fun darAulas(aula: Aula) {
        println("Estou dando aula de $aula")
    }

    override fun fazerChamada(curso: Curso) {
        curso.listaAlunos.forEach{
            println("$it presente?")
        }
    }
}