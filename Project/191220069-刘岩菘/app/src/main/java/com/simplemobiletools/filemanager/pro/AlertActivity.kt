package com.simplemobiletools.filemanager.pro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.simplemobiletools.filemanager.pro.activities.SimpleActivity
import kotlinx.android.synthetic.main.activity_alert.*
import com.simplemobiletools.commons.extensions.*
import com.simplemobiletools.commons.helpers.*
import com.simplemobiletools.filemanager.pro.activities.MainActivity
import com.simplemobiletools.filemanager.pro.fragments.ItemsFragment

import kotlinx.android.synthetic.main.activity_settings.*
import kotlinx.android.synthetic.main.items_fragment.view.*
import java.util.*

class AlertActivity : AppCompatActivity() {
    private var mWasProtectionHandled4alert = false
    private lateinit var fragment: ItemsFragment
    private var wasBackJustPressed = false
    private val BACK_PRESS_TIMEOUT = 5000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert)
        if (savedInstanceState == null) {
            handleAppPasswordProtection {
                mWasProtectionHandled4alert = it
                if (it) {
                    Gleave_no()
                } else {
                    finish()
                }
            }
        }
    }


    private fun Gleave_no(){
        button_no.setOnClickListener(){
            startActivity(Intent(this,MainActivity::class.java))
        }

    }


}
