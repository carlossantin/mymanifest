package io.cloudjump.mymanifest.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Athlete(
    @Id val id: ObjectId?,
    val name: String,
    val associations: List<AthleteAssociation>,
    val equipment: String)
