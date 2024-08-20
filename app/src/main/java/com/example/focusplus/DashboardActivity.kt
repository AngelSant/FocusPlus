package com.example.focusplus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val btnCourse = findViewById<Button>(R.id.btnCourse)
        val btnActivities = findViewById<Button>(R.id.btnActivities)
        val btnProfile = findViewById<Button>(R.id.btnProfile)

        btnCourse.setOnClickListener {
            // Navegar a la actividad de curso
            val intent = Intent(this, CourseActivity::class.java)
            startActivity(intent)
        }
        btnActivities.setOnClickListener {
            // Navegar a la actividad de actividades
            val intent = Intent(this, ActivitiesActivity::class.java)
            startActivity(intent)
        }
        /*btnProfile.setOnClickListener {
            // Navegar a la actividad de perfil
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }*/
    }
}
