package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

class OrdersFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_orders, container, false)

        val cardActive = view.findViewById<CardView>(R.id.cardActiveOrder)
        val btnTrack = view.findViewById<Button>(R.id.btnTrackOrder)

        val openTracking = View.OnClickListener {
            val intent = Intent(requireContext(), TrackingActivity::class.java)
            startActivity(intent)
        }

        cardActive.setOnClickListener(openTracking)
        btnTrack.setOnClickListener(openTracking)

        return view
    }
}
