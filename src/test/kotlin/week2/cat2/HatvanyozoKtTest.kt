package week2.cat2

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameter
import org.junit.runners.Parameterized.Parameters
import util.captureLastLine
import util.withStdIn
import week2.cat2.hatvanyozo.main

@RunWith(Parameterized::class)
class HatvanyozoKtTest {

    @JvmField @Parameter(0) var a = 0.0
    @JvmField @Parameter(1) var b = 0

    @JvmField @Parameter(2) var expected = 0.0

    @Test
    fun test() {
        val out = captureLastLine {
            withStdIn("$a\n$b") {
                main(arrayOf())
            }
        }

        val result = out.toDouble()
        assertEquals(expected, result, 0.01)
    }

    companion object {
        @JvmStatic @Parameters
        fun data() = arrayOf(
                arrayOf(1.0, 1, 1.0),
                arrayOf(2.0, 2, 4.0),
                arrayOf(123.456, 4, 232299784.285),
                arrayOf(-1.0, 4, 1.0),
                arrayOf(-1.0, 5, -1.0)
        )
    }

}
