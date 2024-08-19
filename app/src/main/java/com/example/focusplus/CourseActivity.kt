package com.example.focusplus

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CourseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)

        // Set up ListView with dummy data
        val listView: ListView = findViewById(R.id.courseListView)
        val adapter = CourseAdapter(this, getDummyCourses())
        listView.adapter = adapter
    }

    private fun getDummyCourses(): List<Course> {
        return listOf(
            Course("Kotlin Basics", "3 weeks", "Kotlin"),
            Course("Advanced Android", "4 weeks", "Kotlin"),
            Course("Java Fundamentals", "6 weeks", "Java")
        )
    }
}

data class Course(val title: String, val duration: String, val language: String)

class CourseAdapter(
    context: Context,
    private val courses: List<Course>
) : ArrayAdapter<Course>(context, R.layout.course_item, courses) {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: inflater.inflate(R.layout.course_item, parent, false)
        val course = getItem(position)!!

        val title: TextView = view.findViewById(R.id.courseTitle)
        val duration: TextView = view.findViewById(R.id.courseDuration)
        val language: TextView = view.findViewById(R.id.courseLanguage)

        title.text = course.title
        duration.text = course.duration
        language.text = course.language

        return view
    }
}
