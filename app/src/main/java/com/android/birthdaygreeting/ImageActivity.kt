package com.android.birthdaygreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ImageActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)
        val images = listOf<model>(
                model("image1",R.drawable.image1),
                model("image2",R.drawable.image2),
                model("image3",R.drawable.image3),
                model("image4",R.drawable.image4),
                model("image5",R.drawable.image5),
                model("image6",R.drawable.image6),
                model("image7",R.drawable.image7),
                model("cake",R.drawable.cake)
        )
        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager=GridLayoutManager(this,2)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter=CustomAdapter(this,images){
            val intent= Intent(this,BirthdayGreet::class.java)
            intent.putExtra(INTENT_PARCELABLE,it)
            startActivity(intent)
        }

    }




}