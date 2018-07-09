package com.tureceta.services

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class TurecetaApplication

fun main(args: Array<String>) {
    SpringApplication.run(TurecetaApplication::class.java, *args)
}
