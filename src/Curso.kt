class Curso(
    val nome: String,
    var codCurso: Int = -1,
    val qtMaximaAlunos: Int,

    ) {
    lateinit var profTitular: ProfessorTitular
    lateinit var  profAdjunto: ProfessorAdjunto
     var listaAlunosMatriculado = mutableListOf<Aluno>()





    override fun equals(other: Any?): Boolean {
        val otherCurso = other as? Curso
        return when (other) {
            is Curso -> {
                this.codCurso == otherCurso?.codCurso
            }
            else -> {
                super.equals(other)
            }
        }


    }

    override fun toString(): String {
        return "O nome do curso é: $nome é o  código: $codCurso)"
    }

    fun adicionarUmAluno(umAluno: Aluno?): Boolean {
        return (listaAlunosMatriculado.size <= qtMaximaAlunos &&
                !listaAlunosMatriculado.contains(umAluno))


    }


    fun excluirAluno(umAluno: Aluno) {
        listaAlunosMatriculado.remove(umAluno)



    }


}






















