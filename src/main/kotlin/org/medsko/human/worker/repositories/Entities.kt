package org.medsko.human.worker.repositories

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "worker_template")
class WorkerTemplate(
    @get:Id
    @get:GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

)

/**
 * An instance of a worker, based on a WorkerTemplate
 */
@Entity
@Table(name = "worker")
class Worker(
    @get:Id
    @get:GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,


    @Column
    var pausedUntil: LocalDateTime?,

    var workerName: String

)