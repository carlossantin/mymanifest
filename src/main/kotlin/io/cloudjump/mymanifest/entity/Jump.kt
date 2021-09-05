package io.cloudjump.mymanifest.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class Jump(
    @Id val id: ObjectId?,
    val athlete: AthleteId,
    val dateTime: LocalDateTime,
    val aircraft: String,
    val equipment: String,
    val altitude: Int,
    val delayTime: Int,
    val dropzone: Dropzone,
    val description: String,
    val athletesInSameJump: List<AthleteId>,
    val status: Status
)

data class AthleteId(
    val id: ObjectId?,
    val name: String
)
