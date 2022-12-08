package com.example.fondmemory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import com.example.fondmemory.Service.FirstService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)

        qq.text="aa"

        // findViewById<View>(R.id.start_service).setOnClickListener { v: View? ->
        val intent = Intent(this, FirstService::class.java)
        // 启动服务
        startService(intent)
        //  }
        // findViewById<View>(R.id.stop_service).setOnClickListener { v: View? ->
        val service = Intent(this, FirstService::class.java)
        // 停止服务
        stopService(service)
        // }



    }
}