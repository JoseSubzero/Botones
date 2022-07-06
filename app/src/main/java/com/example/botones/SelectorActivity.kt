package com.example.botones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.botones.databinding.ActivitySelectorBinding

class SelectorActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySelectorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPressed.setOnClickListener {
            val myIntent = Intent(this, SeekBarActivity::class.java )
            startActivity(myIntent)
        }
    }
}