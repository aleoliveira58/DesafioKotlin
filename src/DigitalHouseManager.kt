class DigitalHouseManager() {

    lateinit var listaAlunos: MutableList<Aluno>
    lateinit var listaProf: MutableList<Professor>
    lateinit var listaCurso: MutableList<Curso>
    lateinit var listaMatriculas: MutableList<Matricula>


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
        val aluno = Aluno(nome, sobrenome, codAluno)
        if (listaAlunos.add(aluno)) {
            println("Aluno registrado com sucesso.")
        } else {
            println("Já existe um aluno registrado com o código '$codAluno'.")

        }
    }

    fun matricularAluno(codAluno: Int, codCurso: Int) {
        listaCurso.forEach {
            if (it.codCurso == codCurso) {
                println("O curso que está se matriculando é $codCurso")
            } else {
                println("Curso não encontrado")
            }

            listaAlunos.forEach {
                if (it.codAluno == codAluno) {
                    println("Matricula feita com sucesso")
                } else {
                    println("Aluno não encontrado na lista")

                }

            }


            fun alocarProfessores(codCurso: Int, codProfessorTitular: Int, codProfessorAdjunto: Int) {
                listaProf.forEach {
                    if (it.codProfessor == codProfessorTitular) {

                    }
                }

                listaProf.forEach {
                    if (it.codProfessor == codProfessorAdjunto) {
                    }


                }
            }
        }
    }
}


















