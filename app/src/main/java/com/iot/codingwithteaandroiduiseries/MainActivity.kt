package com.iot.codingwithteaandroiduiseries

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import android.view.View
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
    lateinit var bottomAnim: Animation


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //animation
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        binding.imageView.startAnimation(topAnim)
        binding.textView.startAnimation(bottomAnim)
        binding.textView2.startAnimation(bottomAnim)

        val postDelayed = Handler().postDelayed(Runnable {
            val intent = Intent(this, LoginActivity::class.java)
            val pair = arrayOfNulls<android.util.Pair<View, String>>(2)
            pair[0] = android.util.Pair<View, String>(binding.imageView, "logoname")
            pair[1] = android.util.Pair<View, String>(binding.textView, "title")
            val options = ActivityOptions.makeSceneTransitionAnimation(this, pair[0], pair[1])
            startActivity(intent, options.toBundle())
//            finish()
        }, 5000)
    }

}