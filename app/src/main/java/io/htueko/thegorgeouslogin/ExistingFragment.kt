package io.htueko.thegorgeouslogin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ExistingFragment : androidx.fragment.app.Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_existing, container, false)
    }

}