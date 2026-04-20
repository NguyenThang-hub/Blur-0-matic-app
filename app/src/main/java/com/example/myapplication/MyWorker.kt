package com.example.myapplication

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class MyWorker(appContext: Context, workerParams: WorkerParameters) :
    Worker(appContext, workerParams) {

    override fun doWork(): Result {
        Log.d("MyWorker", "Task is running...")

        // Giả lập công việc (ví dụ tưới cây)
        for (i in 1..5) {
            Log.d("MyWorker", "Working step $i")
            Thread.sleep(1000)
        }

        Log.d("MyWorker", "Task finished!")

        return Result.success()
    }
}