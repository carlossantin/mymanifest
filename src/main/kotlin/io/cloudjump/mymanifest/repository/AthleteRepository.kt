package io.cloudjump.mymanifest.repository

import io.cloudjump.mymanifest.entity.Athlete
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface AthleteRepository: ReactiveMongoRepository<Athlete, ObjectId>