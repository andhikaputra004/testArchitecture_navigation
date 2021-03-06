package com.andhika.testarchitecture_navigation


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_pindah_fragment1.setOnClickListener {
            it.findNavController().navigate(R.id.pertamaFragment)
        }

        btn_pindah_fragment2.setOnClickListener {
            it.findNavController().navigate(R.id.keduaFragment)
        }
        btn_passing_data.setOnClickListener {
            val Bundle = Bundle()
            Bundle.putString("data",et_pass.text.toString())
            it.findNavController().navigate(R.id.passingDataFragment,Bundle)
        }
    }


}
