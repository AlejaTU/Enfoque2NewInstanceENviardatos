package com.example.enfoque2newinstanceenviardatos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.enfoque2newinstanceenviardatos.databinding.FragmentPrimerBinding

class PrimerFragment : Fragment() {
    private var _binding: FragmentPrimerBinding? = null
    private val binding get() = _binding!!

    private var name: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPrimerBinding.inflate(inflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnEntrar.setOnClickListener {
            val name = binding.etNombre.text.toString()
            navigateToSegunxdoFragment(name)
        }
    }

    private fun navigateToSegunxdoFragment(name: String) {
        val segundoFragment = SegundoFragment.newInstance(name)
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_contenedor, segundoFragment)
            .addToBackStack(null)
            .commit()

    }


}