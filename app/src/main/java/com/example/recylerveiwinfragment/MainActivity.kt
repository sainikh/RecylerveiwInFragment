package com.example.recylerveiwinfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import com.example.recylerveiwinfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    //Set Binding Instance for the MainActivity.xml
    private  lateinit var binding : ActivityMainBinding

    //initlize navContorler and mNavHostFragment
    private lateinit var mNavHostFragment: NavHostFragment
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //inflate the MainActivity
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        mNavHostFragment = supportFragmentManager.findFragmentById(R.id.flFragment) as NavHostFragment
        navController = mNavHostFragment.navController




    }
}