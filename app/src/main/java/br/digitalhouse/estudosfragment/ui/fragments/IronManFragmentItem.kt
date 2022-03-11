package br.digitalhouse.estudosfragment.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.digitalhouse.estudosfragment.R


class IronManFragmentItem : Fragment() {

    companion object {
        fun criaFragmento() = CaptainAmericaFragmentItem()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.iron_man_fragment_item, container, false)
    }


}