package io.cloudjump.mymanifest.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document
data class Manifest(
    @Id val id: ObjectId?,
    val date: LocalDate,
    val dropzone: Dropzone,
    val takeoffs: List<TakeOff>
)
