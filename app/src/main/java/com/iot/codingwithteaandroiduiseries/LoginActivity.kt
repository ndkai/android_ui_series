package com.iot.codingwithteaandroiduiseries

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.ui.AppBarConfiguration
import com.iot.codingwithteaandroiduiseries.databinding.ActivityLoginBinding
import com.iot.codingwithteaandroiduiseries.databinding.ActivityMain2Binding
import com.iot.codingwithteaandroiduiseries.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signupBnt.setOnClickListener {
           var intent = Intent(this, SignupActivity::class.java)
            val pair = arrayOfNulls<android.util.Pair<View, String>>(2)
            pair[0] = android.util.Pair<View, String>(binding.textView3, "title")
            pair[1] = android.util.Pair<View, String>(binding.username, "username")
            pair[1] = android.util.Pair<View, String>(binding.password, "pass")
            val options = ActivityOptions.makeSceneTransitionAnimation(this, pair[0], pair[1])
            startActivity(intent, options.toBundle())
        }
        }
}