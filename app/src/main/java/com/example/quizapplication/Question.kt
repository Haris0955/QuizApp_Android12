package com.example.quizapplication

data class Question(
    val id: Int,
    val question: String,
    val questionImage: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int

    )
