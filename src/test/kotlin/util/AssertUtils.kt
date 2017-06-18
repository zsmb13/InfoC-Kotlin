package util

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue

fun assertEqualsWithDelta(expected: Set<Double>, actual: Set<Double>, delta: Double) {
    assertEqualsWithDelta(expected.toList().sorted(), actual.toList().sorted(), delta)
}

fun assertEqualsWithDelta(expected: List<Double>?, actual: List<Double>?, delta: Double) {
    if (expected == null || actual == null) {
        assertEquals(expected, actual)
        return
    }

    Assert.assertEquals(expected.size, actual.size)

    for (i in expected.indices) {
        Assert.assertEquals(expected[i], actual[i], delta)
    }
}

fun assertEqualsEither(expected1: Any, expected2: Any, actual: Any) {
    assertTrue(expected1 == actual || expected2 == actual)
}
