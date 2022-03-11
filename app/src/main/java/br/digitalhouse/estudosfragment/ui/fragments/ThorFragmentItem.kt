package br.digitalhouse.estudosfragment.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.digitalhouse.estudosfragment.R

class ThorFragmentItem : Fragment() {


    companion object{
        fun criaFragmento () = ThorFragmentItem()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.thor_fragment_item,container,false)
    }
}