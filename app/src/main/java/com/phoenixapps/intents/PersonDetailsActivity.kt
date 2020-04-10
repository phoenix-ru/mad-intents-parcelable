package com.phoenixapps.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.phoenixapps.intents.model.Person
import kotlinx.android.synthetic.main.activity_person_details.*

class PersonDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person_details)

        if (intent !== null) {
            val person = intent.getParcelableExtra<Person>("person")
            supplied_name_tv.text = String.format(
                getString(R.string.supplied_name_template), person.name
            )
        }
    }
}
