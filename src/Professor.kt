open class Professor(
     val nome: String,
    val sobrenome: String,
    val tempoCasa: Int,
    var codProfessor: Int
) {

    override fun equals(other: Any?): Boolean {
        val otherProfessor = other as? Professor
        return when (other) {
            is Professor -> {
                this.codProfessor == otherProfessor?.codProfessor
            }
            else -> {
                super.equals(other)
            }
        }
    }

    override fun toString(): String {
        return  "O nome do professor é  $nome $sobrenome , código $codProfessor  e seu tempo de casa é de $tempoCasa anos)"
    }
}