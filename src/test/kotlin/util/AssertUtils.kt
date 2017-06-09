package util

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue

fun assertEqualsSorted(a1: Array<Double>, a2: Array<Double>, delta: Double) {
    Assert.assertEquals(a1.size, a2.size)
    a1.sort()
    a2.sort()
    for (i in a1.indices) {
        Assert.assertEquals(a1[i], a2[i], delta)
    }
}

fun assertEqualsSorted(l1: List<Double>?, l2: List<Double>?, delta: Double) {
    if (l1 == null || l2 == null) {
        assertEquals(l1, l2)
        return
    }

    Assert.assertEquals(l1.size, l2.size)
    val s1 = l1.sorted()
    val s2 = l2.sorted()
    for (i in s1.indices) {
        Assert.assertEquals(s1[i], s2[i], delta)
    }
}

fun assertEqualsEither(expected1: Any, expected2: Any, actual: Any) {
    assertTrue(expected1 == actual || expected2 == actual)
}
