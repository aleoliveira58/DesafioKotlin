fun main(){



    val professorTitular1 = ProfessorTitular("Full Stack" , "Gabriel" , "Vinicius" , 10 , 123)
    val professorTitular2 = ProfessorTitular("Android" , "Julia" , "Gabriela" , 10 , 456)

    val professorAdjunto1 = ProfessorAdjunto("Marcos" , "Guerrero"  , 5 , 789 , 10)
    val professorAdjunto2 = ProfessorAdjunto("Miriam" , "Machado"  , 5 , 987 , 5)




    val digitalHouseManager = DigitalHouseManager()




    digitalHouseManager.registrarCurso("Full Stack", 20001 ,3)
    digitalHouseManager.registrarCurso("Android" , 20002 , 2)








}