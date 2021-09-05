package io.cloudjump.mymanifest.repository

import io.cloudjump.mymanifest.entity.Association
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
interface AssociationRepository: ReactiveMongoRepository<Association, ObjectId> {

    fun findByName(name: String): Mono<Association>
}