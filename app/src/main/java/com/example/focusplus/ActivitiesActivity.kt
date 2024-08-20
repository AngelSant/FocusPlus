package com.example.focusplus

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.focusplus.databinding.ActivitiesActivityBinding

class ActivitiesActivity : AppCompatActivity() {

    private lateinit var binding: ActivitiesActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitiesActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Agregar los puntajes dinámicamente al LinearLayout
        val scores = getDummyScores()
        for (score in scores) {
            val scoreView = LayoutInflater.from(this).inflate(R.layout.score_item, binding.scoreContainer, false)
            val usernameTextView: TextView = scoreView.findViewById(R.id.scoreUsername)
            val pointsTextView: TextView = scoreView.findViewById(R.id.scorePoints)

            usernameTextView.text = score.username
            pointsTextView.text = score.points.toString()

            binding.scoreContainer.addView(scoreView)
        }
    }

    private fun getDummyScores(): List<Score> {
        return listOf(
            Score("User1", 90),
            Score("User2", 80),
            Score("User3", 70)
        )
    }
}

data class Score(val username: String, val points: Int)
