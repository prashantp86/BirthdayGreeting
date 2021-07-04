package com.android.birthdaygreeting
import android.icu.lang.UCharacter.IndicPositionalCategory.NA
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
//import com.android.birthdaygreeting.MainActivity.Companion.NAME_EXTRA
import com.android.birthdaygreeting.MainActivity.Companion.name
import kotlinx.android.synthetic.main.activity_birhday_greet.*

class BirthdayGreet : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birhday_greet)
        //val name=intent.getStringExtra(NAME_EXTRA)

        val image = intent.getParcelableExtra<model>(ImageActivity.INTENT_PARCELABLE)
        val imgSrc = findViewById<ImageView>(R.id.imageView)
        //val imgTitle = findViewById<TextView>(R.id.birthdayGreet)

        if (image != null) {
            imgSrc.setImageResource(image.imagesrc)
        }
            birthdayGreet.text="Happy Birthday\n ${name}!"



    }
}