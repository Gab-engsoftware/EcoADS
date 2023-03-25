package br.com.gabriel.ecoads

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var botao: Button
    private lateinit var campo: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        botao = findViewById(R.id.main_button_enviar)
        campo = findViewById(R.id.main_input_texto)

        botao.setOnClickListener {
            val texto = campo.text.toString()
            Log.i("MainActivity", "O texto digitado é: " + texto)
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("MAIN_KEY_TEXTO", texto)
            startActivity(intent)
        }
    }
}