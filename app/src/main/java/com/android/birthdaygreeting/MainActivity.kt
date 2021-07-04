package com.android.birthdaygreeting
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object{
        var name:String=""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun selectCard(view: View) {
         name=person_name.editableText.toString()
        val intent= Intent(this,ImageActivity::class.java)
//        val intent1= Intent(this,BirthdayGreet::class.java)
//        intent1.putExtra(NAME_EXTRA,name)
        startActivity(intent)
    }

}