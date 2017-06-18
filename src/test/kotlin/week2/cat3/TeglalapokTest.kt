package week2.cat3

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameter
import org.junit.runners.Parameterized.Parameters
import util.captureStdOut
import util.withStdIn
import week2.cat3.teglalapok.main

@RunWith(Parameterized::class)
class TeglalapokTest {

    @Parameter(0)
    lateinit var input: String
    @Parameter(1)
    lateinit var expected: String

    @Test
    fun test() {
        val out = captureStdOut {
            withStdIn(input) {
                main(arrayOf())
            }
        }.joinToString(separator = "\n")

        assertEquals(expected, out)
    }

    companion object {
        @JvmStatic @Parameters
        fun data() = arrayOf(
                arrayOf("3 2 5 2 1",
                        """
                        ooooo ooooo ooooo
                        ooooo ooooo ooooo

                        ooooo ooooo ooooo
                        ooooo ooooo ooooo
                        """.trimIndent()),
                arrayOf("1 1 3 4 1",
                        """
                        ooo
                        ooo
                        ooo
                        ooo
                        """.trimIndent()),
                arrayOf("5 2 5 1 2",
                        """
                        ooooo  ooooo  ooooo  ooooo  ooooo


                        ooooo  ooooo  ooooo  ooooo  ooooo
                        """.trimIndent())
        )
    }

}
