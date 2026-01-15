package com.example.whatsappclone.fragments

import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.whatsappclone.R

class Fragment4 : Fragment(R.layout.fragment4) {

    private var fromFragment: String? = null
    private val currentFragment = "Fragment4"

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

        fun newInstance(fromFragment: String): Fragment4 {
            val fragment = Fragment4()
            val bundle = Bundle()
            bundle.putString(ARG_FROM, fromFragment)
            fragment.arguments = bundle
            return fragment
        }
    }
}
