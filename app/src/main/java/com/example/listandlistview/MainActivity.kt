package com.example.listandlistview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.listandlistview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listOfNumbers = ArrayList<Int>()

        listOfNumbers.add(1)
        listOfNumbers.add(3)
        listOfNumbers.add(7)
        listOfNumbers.add(9)
        listOfNumbers.add(11)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listOfNumbers)
        binding.listView.adapter = adapter

        binding.listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                this,
                "Item clicado ${listOfNumbers.get(position)} com o id ${id}",
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}