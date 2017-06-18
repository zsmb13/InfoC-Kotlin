package week2.cat3

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameter
import org.junit.runners.Parameterized.Parameters
import util.captureLastLine
import util.withStdIn
import week2.cat3.szamtanisorozat.main

@RunWith(Parameterized::class)
class SzamtaniSorozatKtTest {

    @Parameter(0)
    lateinit var input: String
    @Parameter(1)
    lateinit var expected: String

    @Test
    fun test() {
        withStdIn(input) {
            val out = captureLastLine {
                main(arrayOf())
            }

            assertEquals(expected, out)
        }
    }

    companion object {
        @JvmStatic @Parameters
        fun data() = arrayOf(
                arrayOf("3.2 0.6 5.1", "nemnegativ 3.2 3.8 4.4 5.0"),
                arrayOf("-1.7 1.0 2.5", "negativ -1.7 -0.7 0.3 1.3 2.3")
        )
    }

}
