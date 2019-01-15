package com.marinj.evolutiosharedelementworkshop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.transition.ChangeBounds
import androidx.transition.TransitionInflater

class SecondFragment: Fragment(){

    private lateinit var secondFragmentFirstBinding: com.marinj.evolutiosharedelementworkshop.databinding.FragmentSecondBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        secondFragmentFirstBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false)

        val transition = TransitionInflater.from(this.activity).inflateTransition(android.R.transition.move)

        sharedElementEnterTransition = ChangeBounds().apply {
            enterTransition = transition
            sharedElementEnterTransition = transition
            duration = 1000
        }

        return secondFragmentFirstBinding.root
    }
}
