package week2.cat3

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameter
import org.junit.runners.Parameterized.Parameters
import util.captureStdOut
import util.withStdIn
import week2.cat3.tetszolegesmeretusakktabla.main

@RunWith(Parameterized::class)
class TetszolegesMeretuSakktabla {

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
        }

        val jointOut = out.toList()
                .dropLast(1)
                .joinToString(separator = "\n")

        assertEquals(expected, jointOut)
    }

    companion object {
        @JvmStatic @Parameters
        fun data() = arrayOf(
                arrayOf("1",
                        """
                        **..
                        **..
                        ..**
                        ..**
                        """.trimIndent()),
                arrayOf("2",
                        """
                        **..**..
                        **..**..
                        ..**..**
                        ..**..**
                        **..**..
                        **..**..
                        ..**..**
                        ..**..**
                        """.trimIndent())
        )
    }

}
