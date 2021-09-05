package io.cloudjump.mymanifest.repository

import io.cloudjump.mymanifest.entity.Jump
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface JumpRepository: ReactiveMongoRepository<Jump, ObjectId>