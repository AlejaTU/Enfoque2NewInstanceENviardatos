package com.example.enfoque2newinstanceenviardatos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.enfoque2newinstanceenviardatos.databinding.FragmentSegundoBinding

class SegundoFragment : Fragment() {

    private var _binding: FragmentSegundoBinding? = null
    private val binding get() = _binding!!
    private var name: String? = null



    companion object {
        private const val ARG_NAME = "name"

        fun newInstance(name:String): SegundoFragment {
            val fragment = SegundoFragment()
            val bundle = Bundle()
            bundle.putString(ARG_NAME, name)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSegundoBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        name = arguments?.getString(ARG_NAME)
        binding.tvMostrarnombre.text = name
    }

}