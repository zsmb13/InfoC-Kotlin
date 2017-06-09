package week2.cat1

import org.junit.Assert.assertEquals
import org.junit.Test
import util.assertEqualsSorted
import week2.cat1.egyenletrendszer.solve

class EgyenletrendszerKtTest {

    @Test
    fun `valid solution 1`() {
        val result = solve(
                a = 2.0, b = 3.0, p = 18.0,
                c = 3.0, d = 1.0, q = 20.0
        )

        assertEqualsSorted(listOf(6.0, 2.0), result, 0.01)
    }

    @Test
    fun `valid solution 2`() {
        val result = solve(
                a = 0.65, b = 9.16, p = 243.7653,
                c = 14.2, d = 0.1, q = 139.055
        )

        assertEqualsSorted(listOf(9.61, 25.93), result, 0.01)
    }

    @Test
    fun `no solution 1`() {
        val result = solve(
                a = 1.0, b = 2.0, p = 5.0,
                c = 1.0, d = 2.0, q = 6.0
        )

        assertEquals(emptyList<Double>(), result)
    }

    @Test
    fun `no solution 2`() {
        val result = solve(
                a = 165.235, b = -25.124, p = 0.0,
                c = 165.235, d = -25.124, q = 0.1
        )

        assertEquals(emptyList<Double>(), result)
    }

    @Test
    fun `infinite solutions 1`() {
        val result = solve(
                a = 1.0, b = 2.0, p = 5.0,
                c = 2.0, d = 4.0, q = 10.0
        )

        assertEquals(null, result)
    }

    @Test
    fun `infinite solutions 2`() {
        val result = solve(
                a = 165.235, b = -25.124, p = 5.0,
                c = -33.047, d = 5.0248, q = -1.0
        )

        assertEquals(null, result)
    }

}