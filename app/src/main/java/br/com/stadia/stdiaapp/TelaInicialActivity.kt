package br.com.stadia.stdiaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_tela_inicial.*
import kotlinx.android.synthetic.main.toolbar.*

class TelaInicialActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)

        val args = intent.extras
        val usuario = args?.getString("usuário")
        val numero = args?.getInt("numero")

        Toast.makeText(this, usuario, Toast.LENGTH_LONG).show()

        textoTelaInicial.setText("Olá $usuario")

        setSupportActionBar(toolbar)

        supportActionBar?.title = "Disciplinas"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)



    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == R.id.action_buscar) {
            Toast.makeText(this, "Clicou buscar", Toast.LENGTH_SHORT).show()
        }
        else if (id == R.id.action_atualiazar) {
            Toast.makeText(this, "Clicou Atualizar", Toast.LENGTH_SHORT).show()
        }
        else if (id == R.id.action_config) {
            val Intent = Intent(this, ConfiguracaoActivity::class.java)
            Toast.makeText(this, "Clicou configurar", Toast.LENGTH_SHORT).show()

            startActivity(Intent)
        }

        else if (id == android.R.id.home){
            finish()
        }

        return super.onOptionsItemSelected(item)


    }
}