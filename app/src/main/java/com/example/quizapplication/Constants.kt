package com.example.quizapplication

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{

        var questionList = ArrayList<Question>()

        val que1= Question(1,"What country does this flag belong to ?",
            R.drawable.saudi_arabia,"Saudi Arabia","Canada","Pakistan",
            "Japan",1)
        questionList.add(que1)

        val que2= Question(2,"What country does this flag belong to ?",
            R.drawable.us_flag,"Ukraine","Canada","United States",
            "Kazakhstan",3)
        questionList.add(que2)

        val que3= Question(3,"What country does this flag belong to ?",
            R.drawable.uk_flag,"United Kingdom","Canada","United States",
            "Japan",1)
        questionList.add(que3)

        val que4= Question(4,"What country does this flag belong to ?",
            R.drawable.peru_flag,"Peru","Botswana","Wurttemberg",
            "Tanzania",1)
        questionList.add(que4)

        val que5= Question(5,"What country does this flag belong to ?",
            R.drawable.japan_flag,"Finland","Canada","Pakistan",
            "Japan",4)
        questionList.add(que5)

        val que6= Question(6,"What country does this flag belong to ?",
            R.drawable.italy_flag,"Italy","Denmark","Yemen",
            "Oman",1)
        questionList.add(que6)

        val que7= Question(7,"What country does this flag belong to ?",
            R.drawable.germany_flag,"Iran","Germany","Ireland",
            "Hungary",2)
        questionList.add(que7)

        val que8= Question(8,"What country does this flag belong to ?",
            R.drawable.france_flag,"Philippines","England","India",
            "France",4)
        questionList.add(que8)

        val que9= Question(9,"What country does this flag belong to ?",
            R.drawable.china_flag,"China","Peru","Pakistan",
            "Japan",1)
        questionList.add(que9)

        val que10= Question(10,"What country does this flag belong to ?",
            R.drawable.canada_flag,"Saudi Arabia","New Zealand","Canada",
            "Kuwait",3)
        questionList.add(que10)

        return questionList
    }
}