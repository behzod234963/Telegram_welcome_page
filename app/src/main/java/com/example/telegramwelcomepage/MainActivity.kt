package com.example.telegramwelcomepage

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.graphics.scaleMatrix
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    @SuppressLint("ResourceAsColor", "SetTextI18n")
    private fun initViews() {
        var theme=0
        var switch:Int=1

        val llRoot:LinearLayout=findViewById(R.id.llRoot)
        val ivTheme:ImageView=findViewById(R.id.ivTheme)
        val lavMainAnim:LottieAnimationView=findViewById(R.id.lavMainAnim)
        val tvTitle:TextView=findViewById(R.id.tvTitle)
        val tvText:TextView=findViewById(R.id.tvText)
        val ivSwitchOne:ImageView=findViewById(R.id.ivSwitch1)
        val ivSwitchTwo:ImageView=findViewById(R.id.ivSwitch2)
        val ivSwitchThree:ImageView=findViewById(R.id.ivSwitch3)
        val ivSwitchFour:ImageView=findViewById(R.id.ivSwitch4)
        val ivSwitchFive:ImageView=findViewById(R.id.ivSwitch5)
        val ivSwitchSix:ImageView=findViewById(R.id.ivSwitch6)
        val btnStart:Button=findViewById(R.id.btnStart)

        btnStart.setOnClickListener {

            switch++

            when(switch){

                1->{

                    lavMainAnim.setAnimation("telegram.json")
                    tvTitle.text="Telegram"
                    tvText.text="The world's fastest messaging app.\nIt is free and secure."
                    ivSwitchSix.setImageResource(R.drawable.pic_circlegrey)
                    ivSwitchOne.setImageResource(R.drawable.pic_circleblue)
                    lavMainAnim.playAnimation()

                }

                2->{

                    lavMainAnim.setAnimation("fast.json")
                    tvTitle.text="Fast"
                    tvText.text="Telegram delivers messages\nfaster than any other application"
                    ivSwitchOne.setImageResource(R.drawable.pic_circlegrey)
                    ivSwitchTwo.setImageResource(R.drawable.pic_circleblue)
                    lavMainAnim.playAnimation()

                }

                3->{

                    lavMainAnim.setAnimation("gift.json")
                    tvTitle.text="Free"
                    tvText.text="Telegram provides free unlimited\ncloud storage for chats and media"
                    ivSwitchTwo.setImageResource(R.drawable.pic_circlegrey)
                    ivSwitchThree.setImageResource(R.drawable.pic_circleblue)
                    lavMainAnim.playAnimation()

                }

                4->{

                    lavMainAnim.setAnimation("infinite.json")
                    tvTitle.text="Powerful"
                    tvText.text="Telegram has no limits on\nthe size of your media and chats"
                    ivSwitchThree.setImageResource(R.drawable.pic_circlegrey)
                    ivSwitchFour.setImageResource(R.drawable.pic_circleblue)
                    lavMainAnim.playAnimation()

                }

                5->{

                    lavMainAnim.setAnimation("safe.json")
                    tvTitle.text="Secure"
                    tvText.text="Telegram keeps your messages safe\nfrom hacker attacks"
                    ivSwitchFour.setImageResource(R.drawable.pic_circlegrey)
                    ivSwitchFive.setImageResource(R.drawable.pic_circleblue)
                    lavMainAnim.playAnimation()

                }

                6->{

                    lavMainAnim.setAnimation("cloud.json")
                    tvTitle.text="Cloud-Based"
                    tvText.text="Telegram lets you access your\nmessages from multiple devices."
                    ivSwitchFive.setImageResource(R.drawable.pic_circlegrey)
                    ivSwitchSix.setImageResource(R.drawable.pic_circleblue)
                    lavMainAnim.playAnimation()
                    switch=0

                }

            }

        }

        ivTheme.setOnClickListener {

            theme++

            when(theme){

                1->{

                    ivTheme.setImageResource(R.drawable.pic_daytheme)
                    llRoot.setBackgroundColor(R.color.black)
                    tvTitle.setTextColor(R.color.white)
                    tvText.setTextColor(R.color.white1)
                    tvTitle.setTextColor(R.color.white1)
                    tvText.setTextColor(R.color.white1)

                }

                2->{

                    ivTheme.setImageResource(R.drawable.pic_darktheme)
                    llRoot.setBackgroundColor(R.drawable.bg_main)
                    tvTitle.setTextColor(R.color.black)
                    tvText.setTextColor(R.color.black)
                    theme=0

                }

            }

        }

        

    }
}