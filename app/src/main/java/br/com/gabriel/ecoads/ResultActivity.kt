package br.com.gabriel.ecoads

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.com.gabriel.ecoads.databinding.ActivityResultBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    private lateinit var rotulo: TextView
    private lateinit var botaoResult: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val valor = intent.getStringExtra("MAIN_KEY_TEXTO")
        Log.i("ResultActivity","Chegou texto:" + valor)

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        rotulo = binding.activityResultTexto
        botaoResult = binding.activityResultFab

        rotulo.text = valor
        botaoResult.setOnClickListener {
            finish()
        }
    }
}