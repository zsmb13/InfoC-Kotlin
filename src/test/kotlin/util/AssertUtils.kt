package util

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue

fun assertEqualsWithDelta(a1: Set<Double>, a2: Set<Double>, delta: Double) {
    assertEqualsWithDelta(a1.toList().sorted(), a2.toList().sorted(), delta)
}

fun assertEqualsWithDelta(l1: List<Double>?, l2: List<Double>?, delta: Double) {
    if (l1 == null || l2 == null) {
        assertEquals(l1, l2)
        return
    }

    Assert.assertEquals(l1.size, l2.size)

    for (i in l1.indices) {
        Assert.assertEquals(l1[i], l2[i], delta)
    }
}

fun assertEqualsEither(expected1: Any, expected2: Any, actual: Any) {
    assertTrue(expected1 == actual || expected2 == actual)
}
