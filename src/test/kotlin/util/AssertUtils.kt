package util

import org.junit.Assert

fun assertEqualsSorted(a1: Array<Double>, a2: Array<Double>, delta: Double) {
    Assert.assertEquals(a1.size, a2.size)
    a1.sort()
    a2.sort()
    for (i in a1.indices) {
        Assert.assertEquals(a1[i], a2[i], delta)
    }
}
