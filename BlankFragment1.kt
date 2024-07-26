package com.vasifgumbatov.fragmentkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.vasifgumbatov.fragmentkotlin.databinding.FragmentBlank1Binding


class BlankFragment1 : Fragment() {

    private var binding: FragmentBlank1Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank1, container, false)
        return view


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        binding?.fragment1?.setOnClickListener {
//
//            val blankFragment2 = BlankFragment2()
//            parentFragmentManager.beginTransaction()
//                .replace(R.id.fragment1, blankFragment2)
//                .commit()

            binding?.button1?.setOnClickListener {
                val blankFragment = BlankFragment2()
                parentFragmentManager.beginTransaction()
                    .replace(R.id.container, blankFragment)
                    .commit()
            }
//        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}