package io.cloudjump.mymanifest.entity

import java.time.LocalDateTime

data class TakeOff(
    val aircraft: String,
    val altitude: Int,
    val dateTime: LocalDateTime,
    val athletes: List<AthleteId>,
    val status: Status
)
