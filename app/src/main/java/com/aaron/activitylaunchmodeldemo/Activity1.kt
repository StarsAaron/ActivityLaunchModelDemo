package com.aaron.activitylaunchmodeldemo

import android.os.Bundle
import android.content.Intent
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity01.*

class Activity1 : BaseActivity() {
    override var TAG = "Activity1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity01)
        tv_msg.text = TAG+this.toString()
        Log.d(TAG,this.toString())
        Log.d(TAG,"is task root? " + isTaskRoot)
    }

    /**
     * 跳转到 AppB的activity 2
     * 使用FlogAG_activity_NEW_TASK
     */
    fun toActivity1(view: View) {
        var intent = Intent("applicationb.action.SECOND_ACTIVITY")
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }
    fun toActivity2(view: View) {
        var intent = Intent(this, Activity2::class.java)
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
        startActivity(intent)
    }
    fun toActivity3(view: View) {
        startActivity(Intent(this, Activity3::class.java))
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
    }
}
