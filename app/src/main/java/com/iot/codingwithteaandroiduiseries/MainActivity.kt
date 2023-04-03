package com.iot.codingwithteaandroiduiseries

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.core.os.HandlerCompat.postDelayed
import com.iot.codingwithteaandroiduiseries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    //variable
    lateinit var topAnim: Animation
    lateinit var bottomAnim : Animation
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //animation
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)
        
        binding.imageView.startAnimation(topAnim)
        binding.textView.startAnimation(topAnim)
        binding.textView2.startAnimation(bottomAnim)

        val postDelayed = Handler().postDelayed(Runnable {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
    
}