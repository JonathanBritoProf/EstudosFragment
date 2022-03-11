package br.digitalhouse.estudosfragment.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import br.digitalhouse.estudosfragment.R
import br.digitalhouse.estudosfragment.acess.User

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var user =  User()
        var buttonLogin = findViewById<Button>(R.id.loginbtn)
        buttonLogin.setOnClickListener {
        var senha = findViewById<TextView>(R.id.txtSenha)
            var loginValidado = user.validaSenha(senha.text.toString())
            //troca tela
            if(loginValidado){
                var intent = Intent(this, MainActivity :: class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this,"Senha incorreta",Toast.LENGTH_SHORT).show()
            }
        }
    }

}