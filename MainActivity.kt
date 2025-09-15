package com.example.edamame

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import com.example.edamame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            val plotName = binding.etPlotName.text.toString().trim()
            val area = binding.etArea.text.toString().trim()
            if (plotName.isEmpty() || area.isEmpty()) {
                Toast.makeText(this, "Isi nama lahan dan luas dulu", Toast.LENGTH_SHORT).show()
            } else {
                // simple local save demo (no DB included)
                Toast.makeText(this, "Disimpan: $plotName — $area m²", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnTips.setOnClickListener {
            Toast.makeText(this, "Tips: Tanam edamame dengan jarak 20x20 cm, pupuk organik.", Toast.LENGTH_LONG).show()
        }
    }
}
