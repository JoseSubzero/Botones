package com.example.botones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.botones.databinding.ActivitySeekBarBinding

class SeekBarActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySeekBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeekBarBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}