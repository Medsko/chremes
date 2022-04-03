package org.medsko.human.worker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HumanWorkerApplication

fun main(args: Array<String>) {
    runApplication<HumanWorkerApplication>(*args)
}
