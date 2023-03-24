package me.hajoo.ch8

import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.MotionEvent
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity
import me.hajoo.ch8.databinding.ActivityMainBinding

class CheckBoxEventHandler : CompoundButton.OnCheckedChangeListener {
    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
        Log.d("Joo", "체크박스 클릭")
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

//        setContentView(R.layout.activity_main)
        setContentView(binding.root)
        binding.checkbox.setOnCheckedChangeListener(CheckBoxEventHandler())
        binding.button.setOnClickListener { x -> Log.d("Joo", "버튼 클릭") }
        binding.button.setOnLongClickListener { x ->
            Log.d("Joo", "롱버튼 클릭")
            true
        }
    }



    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> {
                Log.d("Joo", "Touch Down Event")
                Log.d("Joo", "Touch xy - x : ${event.x}, y : ${event.y}")
                Log.d("Joo", "Touch rawXy - x : ${event.rawX}, y : ${event.rawY}")
            }
            MotionEvent.ACTION_UP -> {
                Log.d("Joo", "Touch Up Event")
            }
            MotionEvent.ACTION_MOVE -> {
                Log.d("Joo", "Touch Move Event")
            }
        }
        return super.onTouchEvent(event)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when (keyCode) {
            KeyEvent.KEYCODE_0 -> Log.d("Joo", "key down 0 키")
            KeyEvent.KEYCODE_1 -> Log.d("Joo", "key down 1 키")
            KeyEvent.KEYCODE_BACK -> Log.d("Joo", "Back Button")
            KeyEvent.KEYCODE_VOLUME_UP -> Log.d("Joo", "Volume Up")
            KeyEvent.KEYCODE_VOLUME_DOWN -> Log.d("Joo", "Volume Down")
        }
        return super.onKeyDown(keyCode, event)
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        when (keyCode) {
            KeyEvent.KEYCODE_8 -> Log.d("Joo", "key up 8 키")
            KeyEvent.KEYCODE_9 -> Log.d("Joo", "key up 9 키")
        }
        return super.onKeyUp(keyCode, event)
    }

    override fun onKeyLongPress(keyCode: Int, event: KeyEvent?): Boolean {
        when (keyCode) {
            KeyEvent.KEYCODE_A -> Log.d("Joo", "key long press A 키")
            KeyEvent.KEYCODE_B -> Log.d("Joo", "key long press B 키")
        }
        return super.onKeyLongPress(keyCode, event)
    }
}