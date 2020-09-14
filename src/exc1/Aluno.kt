package exc1

class Aluno(var registroAcademico: Int, var nome: String, var sobrenome: String) {
    fun assistirAulas(aula: Aula) {
        println("Estou assistindo aula de ${aula.materia.nome}")
    }

    fun fazerLicoesDeCasa() {
        println("Estou fazendo as lições de casa!")
    }
}