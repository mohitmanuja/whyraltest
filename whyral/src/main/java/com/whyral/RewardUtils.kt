package com.whyral.sdk

import android.content.Context
import android.content.Intent
import com.whyral.WebViewActivity

object RewardUtils {

    fun startRewardFlow(context:Context,authToken:String){
        val intent = Intent(context, WebViewActivity::class.java)
        intent.putExtra("token",authToken)
        context.startActivity(intent)
    }
}