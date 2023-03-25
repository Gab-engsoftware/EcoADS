package br.com.gabriel.ecoads

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ResultActivity : AppCompatActivity() {
    private lateinit var rotulo: TextView
    private lateinit var botaoResult: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val valor = intent.getStringExtra("MAIN_KEY_TEXTO")
        Log.i("ResultActivity","Chegou texto:" + valor)
        rotulo = findViewById(R.id.activity_result_texto)
        botaoResult = findViewById(R.id.activity_result_fab)

        rotulo.text = valor
        botaoResult.setOnClickListener {
            finish()
        }
    }
}