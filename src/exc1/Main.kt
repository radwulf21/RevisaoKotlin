package exc1

fun main() {
    val professora = Professor("Jessica", 42)
    val mobileAndroid = Curso("Digital House - Mobile Android", professora)
    mobileAndroid.adicionarAluno(Aluno("Tilia"), Aluno("Raul"), Aluno("Maraisi"), Aluno("Miguel"), Aluno("Matheus"))
    mobileAndroid.adicionarAula(Aula(Materia("OOP")), Aula(Materia("Kotlin")), Aula(Materia("Git")), Aula(Materia("Android")))
    professora.fazerChamada(mobileAndroid)

    val kotlin = Materia()
}