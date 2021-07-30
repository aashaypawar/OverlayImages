package com.aashay.overlaymultipleimagesinsingleimageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaring and Initializing ImageView and Button from the layout
        val mImageView = findViewById<ImageView>(R.id.imageView)
        val mButton = findViewById<Button>(R.id.button)

        // When button is clicked
        mButton.setOnClickListener {

            // Set the drawable resource file (layer-list of images) in the ImageView
            mImageView.setImageResource(R.drawable.layer)
        }
    }
}