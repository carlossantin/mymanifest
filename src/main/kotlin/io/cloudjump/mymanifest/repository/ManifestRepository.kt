package io.cloudjump.mymanifest.repository

import io.cloudjump.mymanifest.entity.Manifest
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ManifestRepository: ReactiveMongoRepository<Manifest, ObjectId>