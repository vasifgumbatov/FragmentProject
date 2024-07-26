package com.vasifgumbatov.fragmentkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.vasifgumbatov.fragmentkotlin.databinding.FragmentBlank2Binding


class BlankFragment2 : Fragment() {

    private var binding: FragmentBlank2Binding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank2, container, false)
        binding?.button2?.setOnClickListener {
            val blankFragment2 = BlankFragment1()
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment2, blankFragment2)
                .commit()

        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}