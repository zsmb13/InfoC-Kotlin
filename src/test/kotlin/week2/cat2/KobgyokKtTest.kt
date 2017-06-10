package week2.cat2

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameter
import org.junit.runners.Parameterized.Parameters
import util.captureLastLine
import util.withStdIn
import week2.cat2.kobgyok.main

@RunWith(Parameterized::class)
class KobgyokKtTest {

    @JvmField @Parameter(0) var input = 0.0
    @JvmField @Parameter(1) var expected = 0.0

    @Test
    fun test() {
        val out = captureLastLine {
            withStdIn(input.toString()) {
                main(arrayOf())
            }
        }
        val result = out.toDouble()
        assertEquals(expected, result, 0.01)
    }

    companion object {
        @JvmStatic @Parameters
        fun data() = arrayOf(
                arrayOf(1.0, 1.0),
                arrayOf(27.0, 3.0),
                arrayOf(-32.0, -3.175),
                arrayOf(100.0, 4.642)
        )
    }

}
