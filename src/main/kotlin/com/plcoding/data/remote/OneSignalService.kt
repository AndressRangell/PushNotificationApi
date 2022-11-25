package com.plcoding.data.remote

import com.plcoding.data.remote.dto.Notification

interface OneSignalService {

    suspend fun sendNotification(notification: Notification): Boolean

    companion object {
        const val ONESIGNAL_APP_ID = "7a6cd1cf-7e3e-455c-9d47-29a890e585b5"
        const val NOTIFICATIONS = "https://onesignal.com/api/v1/notifications"
    }

}