package br.digitalhouse.estudosfragment.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import br.digitalhouse.estudosfragment.R
import br.digitalhouse.estudosfragment.ui.fragments.CaptainAmericaFragmentDetail
import br.digitalhouse.estudosfragment.ui.fragments.IronManFragmentDetail
import br.digitalhouse.estudosfragment.ui.fragments.ThorFragmentDetail
import br.digitalhouse.estudosfragment.ui.fragments.HulkFragmentDetail


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imageView =  findViewById<ImageView>(R.id.americaicon)
        imageView.setOnClickListener {
            //realizando a troca de fragmento
            var teste = supportFragmentManager.beginTransaction()
            teste.replace(R.id.my_container, CaptainAmericaFragmentDetail.criaFragmento())
            teste.commit()
        }
        var imageViewIron =  findViewById<ImageView>(R.id.ironmanicon)
        imageViewIron.setOnClickListener {
            //realizando a troca de fragmento
            var teste = supportFragmentManager.beginTransaction()
            teste.replace(R.id.my_container, IronManFragmentDetail.criaFragmento())
            teste.commit()
        }
        var imageViewThor =  findViewById<ImageView>(R.id.thoricon)
        imageViewThor.setOnClickListener {
            //realizando a troca de fragmento
            var teste = supportFragmentManager.beginTransaction()
            teste.replace(R.id.my_container, ThorFragmentDetail.criaFragmento())
            teste.commit()
        }
        var imageViewHulk =  findViewById<ImageView>(R.id.hulkicon)
        imageViewHulk.setOnClickListener {
            //realizando a troca de fragmento
            var teste = supportFragmentManager.beginTransaction()
            teste.replace(R.id.my_container, HulkFragmentDetail.criaFragmento())
            teste.commit()
        }
    }

}