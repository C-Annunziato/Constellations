package com.example.constellations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.constellations.adapater.Adapter
import com.example.constellations.data.DataSourceZodiacSigns

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val myDataset = DataSourceZodiacSigns().loadZodiacSigns()
       val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = Adapter(this, myDataset)
        recyclerView.setHasFixedSize(true)


    }
}


