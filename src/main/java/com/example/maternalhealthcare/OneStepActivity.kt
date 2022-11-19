package com.example.maternalhealthcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class OneStepActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_baby_imoji)

        val one_step: ImageButton = findViewById(R.id.one_step)
        one_step.setOnClickListener {
            val intent = Intent(this, JourneyWithYouActivity::class.java)
            startActivity(intent)
        }
    }
}