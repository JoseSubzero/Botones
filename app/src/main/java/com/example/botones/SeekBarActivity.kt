package com.example.botones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import com.example.botones.databinding.ActivitySeekBarBinding

class SeekBarActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySeekBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeekBarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seekBar2.setOnSeekBarChangeListener(object:
        SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int,
                                           fromUser: Boolean) {
                binding.tvSeekBar.text = seek.progress.toString().plus("/100")
            }

            override fun onStartTrackingTouch(seek: SeekBar?) {
                //write custom code for progress is starting
            }

            override fun onStopTrackingTouch(seek: SeekBar?) {
                //write custom code for progress is stopped
            }
        })

    }
}