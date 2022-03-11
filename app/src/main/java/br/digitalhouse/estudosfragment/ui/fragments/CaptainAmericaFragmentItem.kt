package br.digitalhouse.estudosfragment.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.digitalhouse.estudosfragment.R

class CaptainAmericaFragmentItem : Fragment() {


    companion object{
        fun criaFragmento () = CaptainAmericaFragmentItem()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.captain_america_fragment_item,container,false)
    }
}