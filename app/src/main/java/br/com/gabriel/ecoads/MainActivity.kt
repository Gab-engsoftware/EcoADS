package br.com.gabriel.ecoads

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import br.com.gabriel.ecoads.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var botao: Button
    private lateinit var campo: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        botao = binding.mainButtonEnviar
        campo = binding.mainInputTexto

        botao.setOnClickListener {
            val texto = campo.text.toString()
            Log.i("MainActivity", "O texto digitado é: " + texto)
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("MAIN_KEY_TEXTO", texto)
            startActivity(intent)
        }
    }
}