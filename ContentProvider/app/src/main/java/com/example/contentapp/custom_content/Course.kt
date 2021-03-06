package com.example.contentapp.custom_content

import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class Course(
    val id: Long,
    val title: String
)