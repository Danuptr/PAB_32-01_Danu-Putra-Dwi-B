package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val cardResto1 = view.findViewById<CardView>(R.id.cardResto1)
        cardResto1.setOnClickListener {
            val intent = Intent(requireContext(), FoodDetailActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}
