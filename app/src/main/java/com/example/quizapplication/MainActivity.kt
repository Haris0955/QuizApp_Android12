package com.example.quizapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startBtn: Button = findViewById(R.id.id_btn_start)
        val name: EditText = findViewById(R.id.id_et_name)

        startBtn.setOnClickListener{
            if (name.text.isEmpty()){
                Toast.makeText(this,
                    "Please enter your name.",Toast.LENGTH_LONG).show()
            }else{
                val intent: Intent = Intent(this,QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME,name.text.toString())
                startActivity(intent)
                finish()

            }
        }

    }
}