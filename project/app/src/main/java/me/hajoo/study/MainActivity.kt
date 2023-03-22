package me.hajoo.study

import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import me.hajoo.study.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val name = TextView(this).apply {
            typeface = Typeface.DEFAULT_BOLD
            text = "JooHyun Ha"
        }

        val image = ImageView(this).also {
            it.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_launcher_background))
        }

        val address = TextView(this).apply {
            typeface = Typeface.DEFAULT_BOLD
            visibility = View.VISIBLE
            text = "Seoul"
        }

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER

            addView(name, WRAP_CONTENT, WRAP_CONTENT)
            addView(image, WRAP_CONTENT, WRAP_CONTENT)
            addView(address, WRAP_CONTENT, WRAP_CONTENT)
        }

        val binding = ActivityMainBinding.inflate(layoutInflater)
        binding.textView

//        setContentView(layout)
        setContentView(R.layout.activity_main)
    }
}