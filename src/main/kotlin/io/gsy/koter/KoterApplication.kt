package io.gsy.koter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KoterApplication

fun main(args: Array<String>) {
    runApplication<KoterApplication>(*args)
}
