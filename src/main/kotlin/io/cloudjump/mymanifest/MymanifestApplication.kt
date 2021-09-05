package io.cloudjump.mymanifest

import org.springframework.boot.SpringApplication
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MymanifestApplication

fun main(args: Array<String>) {
	val app = SpringApplication(MymanifestApplication::class.java)
	app.webApplicationType = WebApplicationType.REACTIVE
	app.run(*args)
}
