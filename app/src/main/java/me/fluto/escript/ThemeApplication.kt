package me.fluto.escript

import android.app.Application
import com.google.android.material.color.DynamicColors

class ThemeApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        DynamicColors.applyToActivitiesIfAvailable(this)
    }
}