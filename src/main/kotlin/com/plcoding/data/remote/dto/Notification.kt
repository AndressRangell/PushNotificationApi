package com.plcoding.data.remote.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Notification(
    // @SerialNema("include_external_user_ids")
    // val insludeExternalUserIds: List<String>,
    @SerialName("included_segments")
    val includedSegments: List<String>,
    val contents: NotificationMessage,
    val headings: NotificationMessage,
    @SerialName("app_id")
    val appId: String
)
