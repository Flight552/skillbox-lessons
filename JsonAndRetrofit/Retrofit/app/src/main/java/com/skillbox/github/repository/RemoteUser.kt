package com.skillbox.github.repository

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.net.URL
import java.time.Instant
import java.util.*

@JsonClass(generateAdapter = true)
data class RemoteUser(
    @Json(name = "login")
    val username: String?=null,
    @Json(name = "avatar_url")
    val avatar: String?= null,
    val id: Long?= null,
    val node_id: String?= null,
    val gravatar_id: String? = null,
    val url: String?= null,
    val html_url: String?= null,
    val followers_url: String?= null,
    val following_url: String?= null,
    val gists_url: String?= null,
    val starred_url: String?= null,
    val subscriptions_url: String?= null,
    val organizations_url: String?= null,
    val repos_url: String?= null,
    val events_url: String?= null,
    val received_events_url: String?= null,
    val type: String?= null,
    val site_admin: Boolean?= null,
    val name: String?= null,
    val company: String?= null,
    val blog: String?= null,
    val location: String?= null,
    val email: String?= null,
    val hireable: Boolean?= null,
    val bio: String?= null,
    val twitter_username: String?= null,
    val public_repos: Int?= null,
    val public_gists: Int?= null,
    val followers: Int?= null,
    val following: Int?= null,
    val created_at: String?= null,
    val updated_at: String?= null,
    val private_gists: Int?= null,
    val total_private_repos: Int?= null,
    val owned_private_repos: Int?= null,
    val disk_usage: Int? = null,
    val collaborators: Int? = null,
    val two_factor_authentication: Boolean? = false,
    val plan: UserPlan? = null
)