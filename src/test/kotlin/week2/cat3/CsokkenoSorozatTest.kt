package week2.cat3

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameter
import org.junit.runners.Parameterized.Parameters
import util.captureLastLine
import util.withStdIn
import week2.cat3.csokkenosorozat.main

@RunWith(Parameterized::class)
class CsokkenoSorozatTest {

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
                arrayOf("1.1 5.2", "5.2 4.1 3.0 1.9"),
                arrayOf("6.3 2.1", "6.3 4.2")
        )
    }

}
