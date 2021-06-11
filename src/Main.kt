fun main(){
    val digitalHouseManager = DigitalHouseManager()

    digitalHouseManager.registrarProfessorTitular("Pedro" , "Henrique" , 123 , "Full Stack")
    digitalHouseManager.registrarProfessorTitular("João" , "Vinicius" , 456 , "Android")
    digitalHouseManager.registrarProfessorAdjunto("Gabriel" , "Vinicius" , 789 , 10)
    digitalHouseManager.registrarProfessorAdjunto("Igor" , "Silva" , 987 , 5)



    digitalHouseManager.registrarCurso("Full Stack", 20001 ,3)
    digitalHouseManager.registrarCurso("Android" , 20002 , 2)

    digitalHouseManager.alocarProfessores(20001 , 123 , 789)
    digitalHouseManager.alocarProfessores(20001 , 456 , 987)

    digitalHouseManager.registrarAluno("Alessandro" , "Machado", 1)
    digitalHouseManager.registrarAluno("Julia" , "Gabriela", 2)
    digitalHouseManager.registrarAluno("Marcos" , "Guerrero", 3)
    digitalHouseManager.registrarAluno("Miriam" , "Cristina", 4)
    digitalHouseManager.registrarAluno("Cassio" , "Henrique", 5)


    digitalHouseManager.matricularAluno(1 , 20001)
    digitalHouseManager.matricularAluno(2 , 20001)
    digitalHouseManager.matricularAluno(3 , 20001)
    digitalHouseManager.matricularAluno(4 , 20002)
    digitalHouseManager.matricularAluno(5 , 20002)
    



   digitalHouseManager.consultarMatricula(1,DigitalHouseManager())








}