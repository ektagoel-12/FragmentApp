package com.example.whatsappclone.fragments

import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.whatsappclone.R

class Fragment1 : Fragment(R.layout.fragment1) {

    private var fromFragment: String? = null
    private val currentFragment = "Fragment1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fromFragment = arguments?.getString(ARG_FROM)
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(
            requireContext(),
            "You are in $currentFragment, you came from $fromFragment",
            Toast.LENGTH_SHORT
        ).show()
    }

    companion object {
        private const val ARG_FROM = "from_fragment"

        fun newInstance(fromFragment: String): Fragment1 {
            val fragment = Fragment1()
            val bundle = Bundle()
            bundle.putString(ARG_FROM, fromFragment)
            fragment.arguments = bundle
            return fragment
        }
    }
}
