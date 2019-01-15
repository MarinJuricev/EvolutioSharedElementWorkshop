package com.marinj.evolutiosharedelementworkshop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.FragmentNavigatorExtras
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment: Fragment(){

    private lateinit var firstFragmentFirstBinding: com.marinj.evolutiosharedelementworkshop.databinding.FragmentFirstBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        firstFragmentFirstBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false)

        return firstFragmentFirstBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button.setOnClickListener {
            val extras = FragmentNavigatorExtras(
                    imageView to "secondTransitionName")

            view.findNavController().navigate(R.id.second_fragment_action,
                    null,
                    null,
                    extras)
        }
    }
}