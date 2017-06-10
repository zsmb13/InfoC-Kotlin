package week2.cat2

import org.junit.Test
import util.assertEqualsWithDelta
import util.captureStdOut
import week2.cat2.gombok.main

class GombokKtTest {

    @Test
    fun test() {
        val out = captureStdOut {
            main(arrayOf())
        }

        val numbers = out.first()
                .split(", ")
                .map { it.toDouble() }

        val expected = listOf(0.0042, 0.0335, 0.1131, 0.2681, 0.5236, 0.9048)

        assertEqualsWithDelta(expected, numbers, 0.01)
    }

}
