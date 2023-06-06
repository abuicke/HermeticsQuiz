package com.gravitycode.hermeticsquiz.internet

import android.util.Log
import java.net.InetAddress
import java.util.concurrent.Executor
import java.util.concurrent.Executors


fun isInternetAvailable(
    executor: Executor = Executors.newSingleThreadExecutor(),
    callback: (Boolean) -> Unit
) {
    executor.execute {
        val isInternetAvailable = InetAddress.getByName("google.com").equals("")
        Log.i("mo", "isInternetAvailable = $isInternetAvailable")
        callback.invoke(isInternetAvailable)
    }
}