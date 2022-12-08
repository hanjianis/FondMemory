package com.example.fondmemory.Active

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.os.Handler
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.fondmemory.MainActivity
import com.example.fondmemory.R.layout.activity_first
import kotlinx.android.synthetic.main.activity_first.*


class FirstActivity : AppCompatActivity(){
    var SPLASH_TIME = 15000 //This is 3 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  this.requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(activity_first)

   //      title_name.setAlpha(0.0f)
        val fadeOut1 = AlphaAnimation(1.0f, 0.0f)
//        val fadeIn = AlphaAnimation(0.0f, 1.0f)
//        val fadeOut = AlphaAnimation(1.0f, 0.0f)
        title_name.startAnimation(fadeOut1)
        im.startAnimation(fadeOut1)
//
//
        fadeOut1.duration = 100
//     //   fadeOut1.startOffset=10
        fadeOut1.fillAfter = true
//        title_name.startAnimation(fadeIn)
//
//        fadeIn.duration = 10000
//        fadeIn.startOffset=3000
//        fadeIn.fillAfter = true
//
//        title_name.startAnimation(fadeOut)
//        fadeOut.duration = 10000
//        fadeOut.fillAfter = true
       // fadeOut.startOffset = 4200 + fadeIn.startOffset
//
//
        //Code to start timer and take action after the timer ends
        Handler(mainLooper).postDelayed({ //Do any action here. Now we are moving to next page
            val mySuperIntent = Intent(this@FirstActivity, MainActivity::class.java)
            startActivity(mySuperIntent)

            //This 'finish()' is for exiting the app when back button pressed from Home page which is ActivityHome
            finish()
        }, SPLASH_TIME.toLong())

      //  title_name.setAlpha(0.1f)
     //   setUpFadeAnimation(title_name)
        setUpFadeAnimation(im)

//        fadeIn.setAnimationListener(object : Animation.AnimationListener {
//            override fun onAnimationEnd(arg0: Animation) {
//                // start fadeOut when fadeIn ends (continue)
//                title_name.startAnimation(fadeOut)
//            }
//
//            override fun onAnimationRepeat(arg0: Animation) {}
//            override fun onAnimationStart(arg0: Animation) {}
//        })
//
//        fadeOut.setAnimationListener(object : Animation.AnimationListener {
//            override fun onAnimationEnd(arg0: Animation) {
//                // start fadeIn when fadeOut ends (repeat)
//             //   textView.startAnimation(fadeIn)
//                val mySuperIntent = Intent(this@FirstActivity, MainActivity::class.java)
//                startActivity(mySuperIntent)
//            }
//
//            override fun onAnimationRepeat(arg0: Animation) {}
//            override fun onAnimationStart(arg0: Animation) {}
//        })

       // textView.startAnimation(fadeOut)
    }

//    inline fun View.fadeIn(durationMillis: Long = 250) {
//        this.startAnimation(AlphaAnimation(0F, 1F).apply {
//            duration = durationMillis
//            fillAfter = true
//        })
//    }
//
//    inline fun View.fadeOut(durationMillis: Long = 250) {
//        this.startAnimation(AlphaAnimation(1F, 0F).apply {
//            duration = durationMillis
//            fillAfter = true
//        })
//    }

   // private fun setUpFadeAnimation(im: TextView)
   private fun setUpFadeAnimation(im: ImageView) {
        // Start from 0.1f if you desire 90% fade animation
        val fadeIn: Animation = AlphaAnimation(0.0f, 1.0f)
        fadeIn.duration = 5000
        fadeIn.startOffset = 3000
        // End to 0.1f if you desire 90% fade animation
        val fadeOut: Animation = AlphaAnimation(1.0f, 0.0f)
        fadeOut.duration = 5000
       // fadeOut.startOffset = 3000
        fadeIn.setAnimationListener(object : Animation.AnimationListener {


            override fun onAnimationEnd(arg0: Animation) {

                // start fadeOut when fadeIn ends (continue)
               // textView.startAnimation(fadeOut)
                im.startAnimation(fadeOut)
            }

            override fun onAnimationRepeat(arg0: Animation) {

            }
            override fun onAnimationStart(arg0: Animation) {

            }
        })
        fadeOut.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationEnd(arg0: Animation) {
                // start fadeIn when fadeOut ends (repeat)
               // textView.startAnimation(fadeIn)
                im.startAnimation(fadeIn)



            }

            override fun onAnimationRepeat(arg0: Animation) {}
            override fun onAnimationStart(arg0: Animation) {}
        })
       // textView.startAnimation(fadeOut)
        //textView.startAnimation(fadeIn)
       im.startAnimation(fadeIn)
    }
}

