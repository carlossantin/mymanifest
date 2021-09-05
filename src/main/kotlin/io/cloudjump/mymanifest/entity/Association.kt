package io.cloudjump.mymanifest.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Association(
    @Id var id: ObjectId? = null,
    val name: String)
