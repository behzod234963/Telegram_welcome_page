package com.example.telegramwelcomepage

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.fragment.app.Fragment
import com.example.telegramwelcomepage.fragments.BlackFragment
import com.example.telegramwelcomepage.fragments.CloudBasedFragment
import com.example.telegramwelcomepage.fragments.CloudBasedFragmentDark
import com.example.telegramwelcomepage.fragments.FastFragment
import com.example.telegramwelcomepage.fragments.FastFragmentDark
import com.example.telegramwelcomepage.fragments.GiftFragment
import com.example.telegramwelcomepage.fragments.GiftFragmentDark
import com.example.telegramwelcomepage.fragments.PowerfulFragment
import com.example.telegramwelcomepage.fragments.PowerfulFragmentDark
import com.example.telegramwelcomepage.fragments.SecureFragment
import com.example.telegramwelcomepage.fragments.SecureFragmentDark
import com.example.telegramwelcomepage.fragments.TelegramFragment
import com.example.telegramwelcomepage.fragments.TelegramFragmentDark
import com.example.telegramwelcomepage.fragments.WhiteFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }
    @SuppressLint("ResourceAsColor")
    private fun initViews() {
        var theme=0
        var switch:Int=1
        val ivTheme:ImageView=findViewById(R.id.ivTheme)
        val btnStart:Button=findViewById(R.id.btnStart)
        var whiteFragment=WhiteFragment()
        var blackFragment=BlackFragment()

        btnStart.setOnClickListener {

            switch++

            when(switch){

                1->{

                    if (theme==1){

                        blackFragment
                        setTheme(blackFragment)
                        val telegramFragmentDark=TelegramFragmentDark()
                        setFragment(telegramFragmentDark)
                        ivTheme.setImageResource(R.drawable.pic_daytheme)

                    }else{

                        whiteFragment=WhiteFragment()
                        setTheme(whiteFragment)
                        val telegramFragment=TelegramFragment()
                        setFragment(telegramFragment)
                        ivTheme.setImageResource(R.drawable.pic_darktheme)

                    }

                }

                2->{

                    if (theme==1){

                        blackFragment
                        setTheme(blackFragment)
                        val fastFragmentDark=FastFragmentDark()
                        setFragment(fastFragmentDark)
                        ivTheme.setImageResource(R.drawable.pic_daytheme)

                    }else{

                        whiteFragment=WhiteFragment()
                        setTheme(whiteFragment)
                        val fastFragment = FastFragment()
                        setFragment(fastFragment)
                        ivTheme.setImageResource(R.drawable.pic_darktheme)

                    }

                }

                3->{

                    if (theme==1){

                        blackFragment
                        setTheme(blackFragment)
                        val giftFragmentDark=GiftFragmentDark()
                        setFragment(giftFragmentDark)

                    }else{

                        val giftFragment=GiftFragment()
                        setFragment(giftFragment)

                    }

                }

                4->{

                    if (theme==1){

                        val powerfulFragmentDark=PowerfulFragmentDark()
                        setFragment(powerfulFragmentDark)

                    }else{

                        val powerfulFragment=PowerfulFragment()
                        setFragment(powerfulFragment)

                    }

                }

                5->{

                    if (theme==1){

                        val secureFragmentDark=SecureFragmentDark()
                        setFragment(secureFragmentDark)

                    }else{

                        val secureFragment=SecureFragment()
                        setFragment(secureFragment)

                    }

                }

                6->{

                    if (theme==1){

                        val cloudBasedFragmentDark=CloudBasedFragmentDark()
                        setFragment(cloudBasedFragmentDark)

                    }else{

                        val cloudBasedFragment=CloudBasedFragment()
                        setFragment(cloudBasedFragment)

                    }

                    switch=0

                }

            }

        }

        ivTheme.setOnClickListener {

            theme++
            when(theme){

                1->{

                    val blackFragment=BlackFragment()
                    setTheme(blackFragment)
                    val telegramFragmentDark=TelegramFragmentDark()
                    setFragment(telegramFragmentDark)
                    val fastFragmentDark=FastFragmentDark()
                    setFragment(fastFragmentDark)
                    val giftFragmentDark=GiftFragmentDark()
                    setFragment(giftFragmentDark)
                    val powerfulFragmentDark=PowerfulFragmentDark()
                    setFragment(powerfulFragmentDark)
                    val secureFragmentDark=SecureFragmentDark()
                    setFragment(secureFragmentDark)
                    val cloudBasedFragmentDark=CloudBasedFragmentDark()
                    setFragment(cloudBasedFragmentDark)
                    ivTheme.setImageResource(R.drawable.pic_daytheme)

                }

                2->{

                    val whiteFragment=WhiteFragment()
                    setTheme(whiteFragment)
                    val telegramFragment=TelegramFragment()
                    setFragment(telegramFragment)
                    val fastFragment=FastFragment()
                    setFragment(fastFragment)
                    val giftFragment=GiftFragment()
                    setFragment(giftFragment)
                    val powerfulFragment=PowerfulFragment()
                    setFragment(powerfulFragment)
                    val secureFragment=SecureFragment()
                    setFragment(secureFragment)
                    val cloudBasedFragment=CloudBasedFragment()
                    setFragment(cloudBasedFragment)
                    ivTheme.setImageResource(R.drawable.pic_darktheme)
                    theme=0

                }

            }

        }

    }

    @SuppressLint("ResourceType")
    private fun setFragment(view:Fragment){

        supportFragmentManager.beginTransaction().replace(R.id.frFragment,view).commit()

    }

    fun setTheme(theme:Fragment){

        supportFragmentManager.beginTransaction().replace(R.id.rlRelativeLayout,theme).commit()

    }

}