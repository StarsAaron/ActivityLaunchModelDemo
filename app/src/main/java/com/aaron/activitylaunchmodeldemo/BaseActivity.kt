package com.aaron.activitylaunchmodeldemo

import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.PersistableBundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity01.*

import kotlinx.android.synthetic.main.activity_base.*

/**
 * 基础Activity
 */
open class BaseActivity : AppCompatActivity() {
    open var TAG = "BaseActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
        Log.d(TAG, " TaskId: " + getTaskId() + " hasCode:" + this.hashCode())

        dumpTaskAffinity()
    }

    fun dumpTaskAffinity() {
        var info = this.getPackageManager().getActivityInfo(getComponentName(), PackageManager.GET_META_DATA)
        Log.d(TAG, "taskAffinity:" + info.taskAffinity)
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        Log.d(TAG, "onNewIntent")
        Log.i(TAG, " TaskId: " + getTaskId() + " hasCode:" + this.hashCode())
        dumpTaskAffinity()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d(TAG, "onSaveInstanceState")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.d(TAG, "onBackPressed")
    }
}
