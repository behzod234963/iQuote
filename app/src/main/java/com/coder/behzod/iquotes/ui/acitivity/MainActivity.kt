package com.coder.behzod.iquotes.ui.acitivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.coder.behzod.iquotes.R
import com.coder.behzod.iquotes.databinding.ActivityMainBinding
import com.coder.behzod.iquotes.ui.fragments.FragmentFavorite
import com.coder.behzod.iquotes.ui.fragments.FragmentMain
import com.coder.behzod.iquotes.ui.fragments.SplashFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainController()

    }

    private fun mainController() {
        navigation(SplashFragment())
        bottomNavigationView()
    }

    private fun bottomNavigationView() {
        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.menu_main->{
                    navigation(FragmentMain())
                }
                R.id.menu_favorite->{
                    navigation(FragmentFavorite())
                }
            }
            return@setOnItemSelectedListener true

        }
    }

    private fun navigation(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.flActivityMain,fragment).commit()
    }
}