package com.app.akademikapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.akademikapp.databinding.ActivityMainBinding
import com.app.akademikapp.ui.main.MahasiswaFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupActions()
    }

    private fun setupActions() {
        binding.btnMasukMahasiswa.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, MahasiswaFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}