package com.aaron.activitylaunchmodeldemo

import android.os.Bundle
import android.content.Intent
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity01.*


class Activity3 : BaseActivity() {
    override var TAG = "Activity3"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity03)
        tv_msg.text = TAG+this.toString()
        Log.d(TAG, this.toString())
        Log.d(TAG, "is task root? " + isTaskRoot)
    }

    fun toActivity1(view: View) {
        startActivity(Intent(this, Activity1::class.java))
    }

    fun toActivity2(view: View) {
        var intent = Intent(this, Activity2::class.java)
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
        startActivity(intent)
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
    }
}
