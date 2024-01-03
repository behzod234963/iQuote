package com.coder.behzod.iquotes.view.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.coder.behzod.iquotes.R
import javax.inject.Inject

class MainViewImpl @Inject constructor(): MainView {
    override fun navigator(fragmentManager: FragmentManager, fragment: Fragment, bundle: Bundle?) {
        fragmentManager.beginTransaction().replace(R.id.flActivityMain,fragment).commit()
    }

    override fun showView(view: View) {
        view.visibility = View.VISIBLE
    }

    override fun hideView(view: View) {
        view.visibility = View.GONE
    }
}