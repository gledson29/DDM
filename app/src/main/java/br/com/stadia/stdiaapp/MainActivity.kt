package br.com.stadia.stdiaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.login.*

class MainActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        imageview_login.setImageResource(R.drawable.imagem_login)

        botao_login.setOnClickListener {
            val textoUsuario = campo_usuario.text.toString()
            Toast.makeText(this, "Clicou no login: $textoUsuario", Toast.LENGTH_LONG).show()


            var intent = Intent(this, TelaInicialActivity::class.java)

            val params = Bundle()
            params.putString("usuário", textoUsuario)
            params.putInt("numero", 10)

            intent.putExtras(params)

            startActivity(intent)

        }


    }
}