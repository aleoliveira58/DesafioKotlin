class DigitalHouseManager() {

    var listaAlunos = mutableListOf<Aluno>()
    var listaProf = mutableListOf<Professor>()
    var listaCurso = mutableListOf<Curso>()
    var listaMatriculas = mutableListOf<Matricula>()


    fun registrarCurso(nome: String, codCurso: Int, qtMaximaDeAlunos: Int) {
        val curso = Curso(nome, codCurso, qtMaximaDeAlunos)
        if (listaCurso.add(curso)) {
            println("Curso registrado com sucesso.")
        } else {
            println("Já existe um curso registrado com o código '$codCurso'.")
        }

    }


    fun excluirCurso(codCurso: Int) {
        listaCurso.forEach {
            if (it.codCurso.equals(codCurso)) {
                listaCurso.remove(it)
                println("Curso removido com sucesso")
            } else {
                println("Não existe um curso com este código '$codCurso'.")
            }
        }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codProfessor: Int, qtHorasMonitoradas: Int) {
        val professorAdjunto = ProfessorAdjunto(nome, sobrenome, tempoCasa = 0, codProfessor, qtHorasMonitoradas)
        if (listaProf.add(professorAdjunto)) {
            println("Professor registrado com sucesso.")
        } else {
            println("Já existe um professor registrado com o código '$codProfessor'.")
        }


    }


    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        val professorTitular = ProfessorTitular(especialidade, nome, sobrenome, tempoCasa = 0, codigoProfessor)
        if (listaProf.add(professorTitular)) {
            println("Professor registrado com sucesso.")
        } else {
            println("Já existe um professor registrado com o código '$codigoProfessor'.")
        }
    }


    fun excluirProfessor(codProfessor: Int) {
        listaProf.forEach {
            if (it.codProfessor.equals(codProfessor)) {
                listaProf.remove(it)
                println("Professor removido com sucesso")
            } else {
                println("Não existe um professor com este código '$codProfessor'.")

            }
        }
    }

    fun registrarAluno(nome: String, sobrenome: String, codAluno: Int) {
        val aluno: Aluno? = listaAlunos.find { aluno1: Aluno -> aluno1.codAluno == codAluno }
        if (listaAlunos.add(Aluno("", "", 0))) {
            println("Aluno registrado com sucesso.")

        } else {
            println("Já existe um aluno registrado com o código '$codAluno'.")

        }
    }


    fun matricularAluno(codAluno: Int, codCurso: Int) {

        val aluno: Aluno? = listaAlunos.find { aluno1: Aluno -> aluno1.codAluno == codAluno }

        val curso: Curso? = listaCurso.find { curso1: Curso -> curso1.codCurso == codCurso }
        if (curso?.adicionarUmAluno(aluno) as Boolean) {
            val matricula = Matricula(aluno, curso)
            listaMatriculas.add(matricula)
            println("Matricula realizada as ${matricula.date} com sucesso")

        } else {
            println("Matricula não realizada , vagas insuficientes")
        }


    }


    fun alocarProfessores(codCurso: Int, codProfessorTitular: Int, codProfessorAdjunto: Int) {
        val professorTitular: Professor? =
            listaProf.find { profTitular1: Professor -> profTitular1.codProfessor == codProfessorTitular }
        val professorAdjunto: Professor? =
            listaProf.find { professorAdjunto1: Professor -> professorAdjunto1.codProfessor == codProfessorAdjunto }
        val curso: Curso? = listaCurso.find { curso1: Curso -> curso1.codCurso == codCurso }
        curso?.profTitular = professorTitular as ProfessorTitular
        curso?.profAdjunto = professorAdjunto as ProfessorAdjunto


    }

    fun consultarMatricula(codigoAluno: Int, adm: DigitalHouseManager) {
        val matricula: Matricula? = adm.listaMatriculas.find { it.aluno?.codAluno == codigoAluno }
        val curso: Curso? = listaCurso.find { curso1: Curso -> curso1.codCurso != codigoAluno }
        if (matricula == null) {
            println("Você está matriculado no curso $curso")
        } else {
            println("Você não esta se matriculando em nenhum curso")
        }


    }

}






































