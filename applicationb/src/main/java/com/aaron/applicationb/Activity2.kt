package com.aaron.applicationb

import android.os.Bundle

import android.content.Intent
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity01.*


class Activity2 : BaseActivity() {
    override var TAG = "Activity2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity02)
        tv_msg.text = TAG+this.toString()+"\n allowTaskReparenting=true"
        Log.d(TAG,this.toString())
        Log.d(TAG,"is task root? " + isTaskRoot)
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, " TaskId: " + getTaskId() + " hasCode:" + this.hashCode())
    }

    fun toActivity1(view: View) {
        startActivity(Intent(this, Activity1::class.java))
    }
    fun toActivity3(view: View) {
        startActivity(Intent(this, Activity3::class.java))
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
    }
}
