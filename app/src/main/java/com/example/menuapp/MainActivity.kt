package com.example.menuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.activity_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.misettings -> Toast.makeText(this,"clicked on the settings",Toast.LENGTH_LONG).show()
            R.id.miClose -> finish()
            R.id.miFeedback -> Toast.makeText(this,"clicked on the Feedback",Toast.LENGTH_LONG).show()
            R.id.miNotification -> Toast.makeText(this,"clicked on the notification",Toast.LENGTH_LONG).show()
            R.id.miPayement-> Toast.makeText(this,"clicked on the Payements",Toast.LENGTH_LONG).show()
            R.id.miaddContact -> Toast.makeText(this,"clicked on the contact",Toast.LENGTH_LONG).show()
        }
        return true
    }
}