package com.example.simbirsoftsummerpractice.model

import java.io.Serializable

data class Task(
    val id: Int,
    val date_start: Long,
    val date_finish: Long,
    val name: String,
    val description: String
) : Serializable