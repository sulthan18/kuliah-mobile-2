package com.example.praktikum_kampus_2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MoveWithObjectActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_PERSON = "extra_person"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_object)

        // Ambil data dari Intent menggunakan EXTRA_PERSON
        val person = intent.getParcelableExtra<Person>(EXTRA_PERSON)

        val tvDataReceived: TextView = findViewById(R.id.tv_object_received)

        if (person != null) {
            val text = "Name: ${person.name}\nAge: ${person.age}\nEmail: ${person.email}\nCity: ${person.location}"
            tvDataReceived.text = text
        }
    }
}
