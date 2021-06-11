open class Aluno(
    val nome: String,
    val sobrenome: String,
    val codAluno: Int = -1
) {


    override fun equals(other: Any?): Boolean {
        val otherAluno = other as? Aluno
        return when (other) {
            is Aluno -> {
                this.codAluno == otherAluno?.codAluno
            }
            else -> {
                super.equals(other)
            }
        }

    }

    override fun toString(): String {
        return "O nome do aluno é : $nome $sobrenome e o código é $codAluno"
    }


}