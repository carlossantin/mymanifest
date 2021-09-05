package io.cloudjump.mymanifest.controller

import io.cloudjump.mymanifest.entity.Association
import io.cloudjump.mymanifest.service.AssociationService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/v1/associations")
class AssociationController(private val associationService: AssociationService) {

    @PostMapping
    fun addAssociation(@RequestBody association: Association): Mono<Association> {
        return associationService.createAssociation(association.name)
    }

    @GetMapping("/{name}")
    fun getAssociationByName(@PathVariable name: String): Mono<Association> {
        return associationService.findAssociationByName(name);
    }

    @GetMapping
    fun getAllAssociations(): Flux<Association> {
        return associationService.findAllAssociations();
    }
}