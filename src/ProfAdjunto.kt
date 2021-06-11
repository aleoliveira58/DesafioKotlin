open class ProfessorAdjunto(
     nome: String,
    sobrenome: String,
    tempoCasa: Int  ,
    codProfessor: Int,
    val qtHorasMonitorada: Int): Professor(nome, sobrenome, tempoCasa, codProfessor){

    override fun toString(): String {
        return "O nome do professor adjunto é  $nome $sobrenome ,  código é  $codProfessor" +
                " seu tempo de casa é de $tempoCasa anos é sua quantidade de horas monitoradas são $qtHorasMonitorada:00 horas"
    }


    }
