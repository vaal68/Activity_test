package com.example.activity_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    var LOG_TAG = "MYLOG"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(LOG_TAG,"Как чуждо сердцу наслажденье...")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG,"Весна, весна, пора любви,")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG,"Как тяжко мне твое явленье,")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d(LOG_TAG,"Какое томное волненье")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG,"В моей душе, в моей крови...")
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG,"Всё, что ликует и блестит,")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(LOG_TAG,"Наводит скуку и томленье.")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG,"Отдайте мне метель и вьюгу\n" +
                "И зимний долгий мрак ночей.")
    }
}