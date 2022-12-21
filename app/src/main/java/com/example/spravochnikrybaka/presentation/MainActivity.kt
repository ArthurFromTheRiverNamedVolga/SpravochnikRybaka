package com.example.spravochnikrybaka.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.spravochnikrybaka.R
import com.example.spravochnikrybaka.databinding.ActivityMainBinding
import com.example.spravochnikrybaka.databinding.MainContentBinding
import com.example.spravochnikrybaka.domain.ListItem
import com.example.spravochnikrybaka.uscases.MyAdapter
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(),  NavigationView.OnNavigationItemSelectedListener {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.navView.setNavigationItemSelectedListener (this)
        var rcView = findViewById<RecyclerView>(R.id.rcView)
        var list = ArrayList<ListItem>()

        list.add(ListItem(R.drawable.clown_fish,"Clown", "Clown u"))
        list.add(ListItem(R.drawable.fish_ksusa,"Рыба Ксюша", "Самая Ксюшная рыба"))
        list.add(ListItem(R.drawable.lasos_fish,"Просто лосось", "Лососи у у у у у"))
        list.add(ListItem(R.drawable.mol,"Это моль", "В шкафу вырастил"))

        rcView.hasFixedSize()
        rcView.layoutManager = LinearLayoutManager(this)
        rcView.adapter = MyAdapter(list, this)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId){

            R.id.id_fish -> Toast.makeText(this, "Id_fish",Toast.LENGTH_SHORT).show()

            R.id.id_juk-> Toast.makeText(this, "Id_juk",Toast.LENGTH_SHORT).show()

            R.id.id_palec -> Toast.makeText(this, "id_palec",Toast.LENGTH_SHORT).show()

            R.id.id_woman -> Toast.makeText(this, "id_woman",Toast.LENGTH_SHORT).show()


        }

        return true
    }
}