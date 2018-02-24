package com.aaron.activitylaunchmodeldemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import android.content.Intent
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity01.*


class Activity2 : BaseActivity() {
    override var TAG = "Activity2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity02)
        tv_msg.text = TAG+this.toString()
        Log.d(TAG,this.toString())
        Log.d(TAG,"is task root? " + isTaskRoot)
    }

    fun toActivity1(view: View) {
        startActivity(Intent(this, Activity1::class.java))
    }
    fun toActivity2(view: View) {
        var intent = Intent(this, Activity2::class.java)
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
        startActivity(intent)
    }
    fun toActivity3(view: View) {
        var intent = Intent(this, Activity3::class.java)
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET)

        // FLAG_ACTIVITY_NEW_DOCUMENT 退居后台之后再次在桌面点击应用，使用该标记的Activity不会显示，
        // 但还在Task中。
        // 如果在任务历史中点击该应用还是会显示有标记的Activity。
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT)
//        intent.setFlags(Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED)
//        intent.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS)//具有此标记位的Activity不会出如今历史Activity的列表中
        startActivity(intent)

//        startActivity(Intent(this, Activity3::class.java))
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
    }
}
