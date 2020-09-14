package exc1

class Aula (val materia: Materia, val inicio: Int = 14, val termino: Int = 17) {
    override  fun toString() = "$materia inicio: $inicio, termino $termino"
}