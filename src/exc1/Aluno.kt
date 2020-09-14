package exc1

<<<<<<< HEAD
class Aluno(var registroAcademico: Int, var nome: String, var sobrenome: String) {
    fun assistirAulas(aula: Aula) {
        println("Estou assistindo aula de ${aula.materia.nome}")
    }

    fun fazerLicoesDeCasa() {
        println("Estou fazendo as lições de casa!")
    }
}
=======
class Aluno (val nome:String, val sobrenome: String = "Doe", val registroAcademico: String = "007"){
    fun assistirAula(aula:Aula) {
        println("Assistindo aula $aula")
    }

    fun fazerLicao() {
        println("Fazendo lição")
    }

    override fun toString() = "$nome $sobrenome (ra: $registroAcadmeico)"
}


//class Aluno (val nome: String, val sobrenome: String, val registroAcademico: String) {
//
//    fun assitirAula (var presenca: Boolean): String {
//
//        when(presenca){
//            true -> println("Presente")
//            false -> println("Ausente")
//        }
//    }

//    fun fazerLicoes(var paraCasaFeito: Boolean): String {
//        if(assistirAula){
//            when(paraCasaFeito){
//                true -> println("Feito")
//                false -> println("Que feio, não fez o para casa!")
//            }
//        }
//    }
//}
>>>>>>> f2498cfa111b646fa4394bb3be00df310c6e0633
