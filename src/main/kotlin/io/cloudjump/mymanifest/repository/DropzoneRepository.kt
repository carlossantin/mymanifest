package io.cloudjump.mymanifest.repository

import io.cloudjump.mymanifest.entity.Dropzone
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface DropzoneRepository: ReactiveMongoRepository<Dropzone, ObjectId>