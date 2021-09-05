package io.cloudjump.mymanifest.service

import io.cloudjump.mymanifest.entity.Association
import io.cloudjump.mymanifest.repository.AssociationRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class AssociationService(private val associationRepository: AssociationRepository) {

    fun createAssociation(name: String): Mono<Association> {
        return associationRepository.findByName(name)
            .switchIfEmpty(associationRepository.save(Association(name = name)))
    }

    fun updateAssociation(association: Association): Mono<Association> {
        return associationRepository.save(association)
    }

    fun findAssociationByName(name: String): Mono<Association> {
        return associationRepository.findByName(name)
    }

    fun findAllAssociations(): Flux<Association> {
        return associationRepository.findAll()
    }
}