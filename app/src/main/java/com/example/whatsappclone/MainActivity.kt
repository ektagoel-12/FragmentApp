package com.example.whatsappclone

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.whatsappclone.fragments.Fragment1
import com.example.whatsappclone.fragments.Fragment2
import com.example.whatsappclone.fragments.Fragment3
import com.example.whatsappclone.fragments.Fragment4

class MainActivity : AppCompatActivity() {

    private var currentFragmentName = "None"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn1).setOnClickListener {
            loadFragment(Fragment1.newInstance(currentFragmentName))
            currentFragmentName = "Fragment1"
        }

        findViewById<Button>(R.id.btn2).setOnClickListener {
            loadFragment(Fragment2.newInstance(currentFragmentName))
            currentFragmentName = "Fragment2"
        }

        findViewById<Button>(R.id.btn3).setOnClickListener {
            loadFragment(Fragment3.newInstance(currentFragmentName))
            currentFragmentName = "Fragment3"
        }

        findViewById<Button>(R.id.btn4).setOnClickListener {
            loadFragment(Fragment4.newInstance(currentFragmentName))
            currentFragmentName = "Fragment4"
        }

        // Default fragment
        loadFragment(Fragment1.newInstance("None"))
        currentFragmentName = "Fragment1"
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}
