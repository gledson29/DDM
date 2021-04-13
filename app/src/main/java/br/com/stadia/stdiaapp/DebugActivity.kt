package br.com.stadia.stdiaapp

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class DebugActivity : AppCompatActivity() {

    private val TAG = "STADIAApp"
    private val className: String
        get() {
            val c = javaClass.name
            return c.substring(c.lastIndexOf("."))



        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "${className}ame.onCreate() chamado")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "$className.onStart()chamado")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "$className.onRestart()chamado")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "$className.onResume()chamado")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "$className.onPause()chamado")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "$className.onStop()chamado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "$className.onDestroy()chamado")
    }
}