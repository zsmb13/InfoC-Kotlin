package week2.cat1

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test
import util.assertEqualsEither
import week2.cat1.masodfokuegyenlet.Complex
import week2.cat1.masodfokuegyenlet.solve

class MasodfokuEgyenletKtTest {

    private fun assertEquals(expected: List<Complex>, actual: List<Complex>) {
        assertEquals(expected.size, actual.size)

        if (expected.size == 1) {
            assertEquals(expected.first(), actual.first())
        }
        else {
            assertEqualsEither(expected.first(), expected.last(), actual.first())
            assertEqualsEither(expected.first(), expected.last(), actual.last())
            assertNotEquals(actual.first(), actual.last())
        }
    }

    @Test
    fun `single result 1`() {
        val expected = listOf(Complex(5.0))

        val result = solve(1.0, -10.0, 25.0)

        assertEquals(expected, result)
    }

    @Test
    fun `single result 2`() {
        val expected = listOf(Complex(-0.3512))

        val result = solve(1.0, 0.7024, 0.123341)

        assertEquals(expected, result)
    }

    @Test
    fun `two results 1`() {
        val expected = listOf(Complex(-52.3512), Complex(15189.5))

        val result = solve(1.0, -15137.1488, -795188.5524)

        assertEquals(expected, result)
    }

    @Test
    fun `two results 2`() {
        val expected = listOf(Complex(1.0), Complex(2.0))

        val result = solve(1.0, -3.0, 2.0)

        assertEquals(expected, result)
    }

    @Test
    fun `complex result 1`() {
        val expected = listOf(Complex(-1.0, -1.4142), Complex(-1.0, 1.4142))

        val result = solve(1.0, 2.0, 3.0)

        assertEquals(expected, result)
    }

    @Test
    fun `complex result 2`() {
        val expected = listOf(Complex(-3.08518, -2.12994), Complex(-3.08518, 2.12994))

        val result = solve(516.48, 3186.872, 7259.124)

        assertEquals(expected, result)
    }

}
