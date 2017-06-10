package week2.cat2

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameter
import org.junit.runners.Parameterized.Parameters
import util.captureLastLine
import util.withStdIn
import week2.cat2.sorozateleme.main

@RunWith(Parameterized::class)
class SorozatElemeKtTest {

    @JvmField @Parameter(0) var input = 0
    @JvmField @Parameter(1) var expected = 0

    @Test
    fun test() {
        val out = captureLastLine {
            withStdIn(input.toString()) {
                main(arrayOf())
            }
        }

        assertEquals(expected, out.toInt())
    }

    companion object {
        @JvmStatic @Parameters
        fun data() = arrayOf(
                arrayOf(0, 2),
                arrayOf(1, 9),
                arrayOf(2, 23),
                arrayOf(3, 51),
                arrayOf(4, 107),
                arrayOf(5, 219),
                arrayOf(6, 443),
                arrayOf(7, 891)
        )
    }

}