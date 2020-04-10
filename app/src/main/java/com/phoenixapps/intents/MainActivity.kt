package com.phoenixapps.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.phoenixapps.intents.model.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start_btn.setOnClickListener {
            onStartBtnClick()
        }
    }

    private fun onStartBtnClick() {
        val name = name_et.text.toString()
        if (name.isEmpty()) {
            Toast.makeText(this, "Please, enter the name", Toast.LENGTH_LONG).show()
            return
        }

        val person = Person(name)
        val intent = Intent(this, PersonDetailsActivity::class.java)
        intent.putExtra("person", person)

        startActivity(intent)
    }
}
