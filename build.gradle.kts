import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.5.3"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.5.21"
	kotlin("plugin.spring") version "1.5.21"
}

group = "io.cloudjump"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	// Spring Boot Webflux
	implementation("org.springframework.boot:spring-boot-starter-webflux")
	implementation("org.springframework.data:spring-data-commons")
	implementation("org.springframework.data:spring-data-jpa")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

	// MongoDB
	implementation("org.springframework.boot:spring-boot-starter-data-mongodb-reactive")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("io.zonky.test:embedded-database-spring-test:2.0.1")
	testImplementation("org.jetbrains.kotlin:kotlin-test")
	testImplementation("io.mockk:mockk:1.12.0")
	testImplementation("io.projectreactor:reactor-test")

	// Spek Framework
	testRuntimeOnly("org.spekframework.spek2:spek-runner-junit5:2.0.15")
	implementation("org.spekframework.spek2:spek-dsl-jvm:2.0.15")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
