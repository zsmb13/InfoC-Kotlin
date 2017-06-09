package week2.cat1

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameter
import util.captureStdOut
import util.withStdIn
import week2.cat1.pozitivnegativnulla.main

@RunWith(Parameterized::class)
class PozitivNegativNullaKtTest {

    @Parameter(0) lateinit var input: String
    @Parameter(1) lateinit var expectedSign: String
    @Parameter(2) lateinit var expectedFractional: String

    @Test
    fun test() {
        val out = captureStdOut {
            withStdIn(input) {
                main(arrayOf())
            }
        }

        val (sign, fractional) = out.toList()
                .filter { it.isNotEmpty() }
                .takeLast(2)

        assertEquals(expectedSign, sign)
        assertEquals(expectedFractional, fractional)
    }

    companion object {
        @JvmStatic @Parameterized.Parameters
        fun data() = arrayOf(
                arrayOf("2", "Pozitív.", "Egész."),
                arrayOf("0", "Nulla.", "Egész."),
                arrayOf("-2", "Negatív.", "Egész."),
                arrayOf("2.0", "Pozitív.", "Egész."),
                arrayOf("2.01", "Pozitív.", "Nem egész."),
                arrayOf("-0.01", "Negatív.", "Nem egész.")
        )
    }

}
