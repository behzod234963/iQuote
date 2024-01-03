package com.coder.behzod.iquotes.ui.fragments

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.coder.behzod.iquotes.R
import com.coder.behzod.iquotes.databinding.FragmentSplashBinding
import com.coder.behzod.iquotes.view.main.MainViewImpl
import com.coder.behzod.iquotes.view.retrofit.RetrofitView
import com.coder.behzod.iquotes.view.retrofit.RetrofitViewImpl
import com.coder.behzod.quotesapp.model.model.QuotesItem
import com.coder.behzod.quotesapp.presenter.main.MainPresenterImpl
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import kotlin.random.Random

@AndroidEntryPoint
class SplashFragment : Fragment(), RetrofitView {

    lateinit var binding: FragmentSplashBinding
    @Inject
    lateinit var presenter: MainPresenterImpl
    @Inject
    lateinit var mainView: MainViewImpl
    @Inject
    lateinit var retrofitView: RetrofitViewImpl
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(layoutInflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainController()
    }

    private fun mainController() {
        val bottomNavigationView: BottomNavigationView =
            view?.findViewById(R.id.bottomNavigationView)!!
        mainView.hideView(bottomNavigationView)
        getQuote()
        setView(QuotesItem())
        openNextFragment()
    }

    private fun openNextFragment() {
        Handler().postDelayed({
            mainView.navigator(childFragmentManager, FragmentMain())
        }, 15000)
    }

    private fun getQuote() {
        val randomInt = (0..100).random()
        presenter.getById(randomInt)
    }

    override fun setViews(quotes: ArrayList<QuotesItem>?) {
        TODO("Not yet implemented")
    }

    override fun setView(quote: QuotesItem?) {
        binding.apply {
            tvSplashQuote.text = quote?.quote
            tvSplashAuthor.text = quote?.author
        }
    }
}