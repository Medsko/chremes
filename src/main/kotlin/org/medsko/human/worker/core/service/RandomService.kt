package org.medsko.human.worker.core.service

import org.springframework.stereotype.Service
import kotlin.random.Random

/**
 * Provides methods for easy randomization. Mock for repeatable unit tests.
 */
@Service
class RandomService {


    fun randomInt(from: Int, until: Int): Int = Random.nextInt(from, until)

    /**
     * @param percentage - percent chance that the return value will be true.
     */
    fun rollPercentage(percentage: Int): Boolean = percentage >= Random.nextInt(1, 100)

    /**
     * @param chance - the denominator (to a numerator of 1) of chance that the return value will be true.
     */
    fun roll(chance: Int): Boolean = roll(1, chance)

    /**
     * @param numerator - the numerator of the chance that the return value will be true.
     * @param denominator - the denominator of the chance that the return value will be true.
     */
    fun roll(numerator: Int, denominator: Int): Boolean {
        if (denominator <= 0) return false
        if (numerator == denominator) return true
        if (numerator > denominator) throw IllegalArgumentException("Numerator should be smaller than or equal to" +
                " denominator! Numerator: $numerator, denominator: $denominator")

        val booleans = BooleanArray(denominator)
        for (i in 0 until numerator) booleans[i] = true

        val randomIndex = Random.nextInt(1, denominator) - 1
        return booleans[randomIndex]
    }
}