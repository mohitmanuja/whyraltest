package com.sample.whyral

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.whyral.sdk.RewardUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        finish()
        RewardUtils.startRewardFlow(this,"")
    }
}