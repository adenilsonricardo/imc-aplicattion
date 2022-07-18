package com.example.imcapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("lifecycle","Create - criando tela" )
    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecycle","Start - tela visível" )
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifecycle","Resume - disponivel interação com a tela" )
    }

    override fun onPause() {
        super.onPause()
        Log.w("lifecycle","Pause - interação indisponivel" )
    }

    override fun onStop() {
        super.onStop()
        Log.w("lifecycle","Stop - tela não visivel, porém ainda existe" )
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("lifecycle","Restart - volta a fun onStart reiniciando ciclo" )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("lifecycle","Destroy - app finalizado" )
    }
}