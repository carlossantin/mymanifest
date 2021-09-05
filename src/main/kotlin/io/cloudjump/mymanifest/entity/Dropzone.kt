package io.cloudjump.mymanifest.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Dropzone(
    @Id val id: ObjectId?,
    val name: String,
    val aircrafts: List<Aircraft>,
    val country: String,
    val city: String,
    val state: String
)