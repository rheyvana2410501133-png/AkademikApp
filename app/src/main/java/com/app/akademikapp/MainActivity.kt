package com.app.akademikapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.app.akademikapp.databinding.ActivityMainBinding
import com.app.akademikapp.ui.main.AdminFragment
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
            replaceFragment(MahasiswaFragment())
        }
        binding.btnMasukAdmin.setOnClickListener {
            replaceFragment(AdminFragment())
        }
    }

    fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .addToBackStack(null)
            .commit()
    }
}