package com.martinus.wisataku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

@Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class WisataDetail : AppCompatActivity() {

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wisata_detail)
        val actionbar = supportActionBar
        actionbar!!.title = "Detail Wisata"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val wisata = intent.extras?.get("data") as Wisata

        val name: TextView = findViewById(R.id.name)
        val detail: TextView = findViewById(R.id.detail)
        val img: ImageView = findViewById(R.id.img_detail)


        name.text = wisata.name
        detail.text = wisata.detail
        img.setImageResource(wisata.photo)
    }
}