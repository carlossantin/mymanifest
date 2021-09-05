package io.cloudjump.mymanifest.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Aircraft(
    @Id val prefix: String)
