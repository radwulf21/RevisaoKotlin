package exc1

class Aluno (val nome:String, val sobrenome: String = "Doe", val registroAcademico: String = "007"){
    fun assistirAula(aula:Aula) {
        println("Assistindo aula $aula")
    }

    fun fazerLicao() {
        println("Fazendo lição")
    }

    override fun toString() = "$nome $sobrenome (ra: $registroAcademico)"
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