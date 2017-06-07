package week1.cat2

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameter
import org.junit.runners.Parameterized.Parameters
import util.captureLastLine
import util.withStdIn
import week1.cat2.celsiusfahrenheit.main

@RunWith(Parameterized::class)
class CelsiusFahrenheitKtTest {

    @JvmField @Parameter(0)
    var input: Double = 0.0
    @JvmField @Parameter(1)
    var expected: Double = 0.0

    @Test
    fun test() {
        withStdIn(input) {
            val out = captureLastLine {
                main(arrayOf())
            }
            val result = out.substringAfter(' ').substringBefore('°').toDouble()
            assertEquals(expected, result, 0.1)
        }
    }

    companion object {
        @JvmStatic @Parameters
        fun data() = arrayOf(
                arrayOf(0.0, 32.0),
                arrayOf(40.0, 104.0),
                arrayOf(-40.0, -40.0),
                arrayOf(-9.01, 15.78)
        )
    }

}