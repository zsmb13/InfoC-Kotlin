package week1.cat2

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameter
import org.junit.runners.Parameterized.Parameters
import util.captureLastLine
import util.withStdIn
import week1.cat2.idotartam.main

@RunWith(Parameterized::class)
class IdotartamKtTest {

    @Parameter(0)
    lateinit var input: String
    @Parameter(1)
    lateinit var expected: String

    @Test
    fun test() {
        val inputLines = input.replace(' ', '\n')
        withStdIn(inputLines) {
            val out = captureLastLine {
                main(arrayOf())
            }
            assertEquals(expected, out)
        }
    }

    companion object {
        @JvmStatic @Parameters
        fun data() = arrayOf(
                arrayOf("0 0 0 0 0 0", "0"),

                arrayOf("0 0 0 0 0 1", "1"),
                arrayOf("0 0 0 0 1 0", "60"),
                arrayOf("0 0 0 1 0 0", "3600"),

                arrayOf("0 0 0 1 2 3", "3723"),
                arrayOf("1 2 3 0 0 0", "82677"),
                arrayOf("1 2 3 4 5 6", "10983"),
                arrayOf("4 5 6 1 2 3", "75417"),
                arrayOf("15 59 58 16 0 2", "4"),
                arrayOf("23 59 59 0 0 1", "2")
        )
    }

}
