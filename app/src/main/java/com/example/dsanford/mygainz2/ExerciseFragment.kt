package com.example.dsanford.mygainz2

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ExerciseFragment: Fragment() {

    companion object {
        fun newInstance(): ExerciseFragment {
            return ExerciseFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.exercise_fragment, container, false)
    }

}