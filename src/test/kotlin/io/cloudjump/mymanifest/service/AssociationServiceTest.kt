package io.cloudjump.mymanifest.service

import io.cloudjump.mymanifest.entity.Association
import io.cloudjump.mymanifest.repository.AssociationRepository
import org.bson.types.ObjectId
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner
import reactor.core.publisher.Mono
import reactor.test.StepVerifier

@RunWith(MockitoJUnitRunner::class)
class AssociationServiceTest {

    companion object {
        lateinit var associationService: AssociationService

        private val associationRepository = Mockito.mock(AssociationRepository::class.java)

        @BeforeAll
        @JvmStatic
        internal fun initService() {
            associationService = AssociationService(associationRepository)
        }
    }

    @Test
    fun testSaveAlreadyExistentAssociation() {
        val savedAssociation = Association(id = ObjectId("507f191e810c19729de860ea"), name = "CBPq")
        Mockito.doReturn(Mono.just(savedAssociation)).`when`(associationRepository).findByName(savedAssociation.name)

        val association = associationService.createAssociation("CBPq")

        StepVerifier.create(association)
                    .expectNextMatches { it.id == savedAssociation.id && it.name == savedAssociation.name}
                    .verifyComplete()
    }
}