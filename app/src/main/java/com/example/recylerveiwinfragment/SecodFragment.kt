package com.example.recylerveiwinfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs


/**
 * A simple [Fragment] subclass.
 * Use the [SecodFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecodFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_secod, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val inputData : SecodFragmentArgs by navArgs()
            val data : String = inputData.firsFragmentdata
        var userText = view.findViewById<TextView>(R.id.userText)

        userText.setText(data)

    }



}