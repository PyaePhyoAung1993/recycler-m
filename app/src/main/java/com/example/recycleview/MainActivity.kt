package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.adapter.PersonAdapter
import com.example.recycleview.model.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var personList = ArrayList<Person>()
        personList.add(Person(R.drawable.asss2,"Fine Grain Sugar",
            "$20.00","-","1kg","+","$10 discount"))

        personList.add(Person(R.drawable.peanut,"Peanut",
            "$80.00","-","1kg","+","$10 discount"))

        personList.add(Person(R.drawable.rice,"Rice",
            "$20.00","-","2kg","+","$10 discount"))


        var personAdapter = PersonAdapter(personList)
        //horizontal
//        recycleView.layoutManager = LinearLayoutManager(this,
//            LinearLayoutManager.HORIZONTAL,false)

        recycleView.layoutManager = LinearLayoutManager(this)

          //gridView
//        recycleView.layoutManager = GridLayoutManager(this,2)

//
        recycleView.adapter = personAdapter
    }
}