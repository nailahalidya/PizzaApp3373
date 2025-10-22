package com.example.pizzaapp3373

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment


class HomeActivity : AppCompatActivity() {
    //fc for replace fragment
    private fun replaceFragment(fragment:Fragment){
    val fragmentManager = supportFragmentManager
    val fragmentTrx = fragmentManager.beginTransaction()
    fragmentTrx.replace(R.id.fragmentContainerView, fragment)
    fragmentTrx.commit()
}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //instance
        val txtAccount: TextView =  findViewById(R.id.textViewMenuAccount)
        val txtMenu : TextView = findViewById<TextView>(R.id.textViewMenuPizza)
        val txtTransaction : TextView = findViewById<TextView>(R.id.textViewMenuShopping)
        val txtReport : TextView = findViewById<TextView>(R.id.textViewMenuReport)

        //event txtMenuAccount click
        txtAccount.setOnClickListener {
            replaceFragment(AccountFragment())
        }

        //event txtMenuPizza click
        txtMenu.setOnClickListener {
            replaceFragment(AccountFragment())
        }

        //event txtMenuAccount click
        txtTransaction.setOnClickListener {
            replaceFragment(AccountFragment())
        }

        //event txtMenuAccount click
        txtReport.setOnClickListener {
            replaceFragment(AccountFragment())
        }
    }
}