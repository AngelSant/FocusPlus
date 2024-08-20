package com.example.focusplus

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.focusplus.databinding.ProfileActivityBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ProfileActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ProfileActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Dummy data
        val profileName = "John Doe"
        val coursesEnrolled = "3"
        val appScore = "250"

        // Set data to views
        binding.profileName.text = profileName
        binding.profileCourses.text = "Courses Enrolled: $coursesEnrolled"
        binding.profileScore.text = "App Score: $appScore"
    }
}
