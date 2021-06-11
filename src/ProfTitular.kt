open class ProfessorTitular(
    val especialidade: String,
    nome: String,
    sobrenome: String,
    tempoCasa: Int,
    codProfessor: Int
) : Professor(nome, sobrenome, tempoCasa, codProfessor) {

    override fun toString(): String {
        return "O nome do professor titular é $nome $sobrenome, código é $codProfessor " +
                "seu tempo de casa e de $tempoCasa anos é sua especialidade é $especialidade"


    }
}


