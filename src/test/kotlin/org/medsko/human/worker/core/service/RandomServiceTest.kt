package org.medsko.human.worker.core.service

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class RandomServiceTest {

    private val service = RandomService()

    @Test
    internal fun smallChanceWillEventuallySucceed() {
        while (!service.rollPercentage(1)) {
            println("no luck so far!")
        }
        assertTrue(true)
    }

    @Test
    internal fun rollWithCertainSuccessPercentage() {
        assertTrue(service.rollPercentage(100))
    }

    @Test
    internal fun rollWithCertainFailurePercentage() {
        assertFalse(service.rollPercentage(0))
    }

    @Test
    internal fun rollWithCertainSuccess() {
        assertTrue(service.roll(1))
        assertTrue(service.roll(100, 100))
    }

    @Test
    internal fun rollWithCertainFailure() {
        assertFalse(service.roll(0))
        assertFalse(service.roll(0, 0))
    }
}