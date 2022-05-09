package ru.pl.myquizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class QuizQuestionsActivity : AppCompatActivity() {

    private val TAG: String = "QuestionsActivityTag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        val questionList = Constants.getQuestions()
        Log.i(TAG, "Размер списка вопросов: ${questionList.size}")
    }
}