package week2.cat2

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameter
import org.junit.runners.Parameterized.Parameters
import util.captureLastLine
import util.withStdIn
import week2.cat2.negyzetszamok.main

@RunWith(Parameterized::class)
class NegyzetszamokKtTest {

    @JvmField @Parameter(0)
    var input = 0

    @Parameter(1)
    lateinit var expected: String

    @Test
    fun test() {
        val out = captureLastLine {
            withStdIn("$input") {
                main(arrayOf())
            }
        }

        assertEquals(expected, out)
    }

    companion object {
        @JvmStatic @Parameters
        fun data() = arrayOf(
                arrayOf(1, "1"),
                arrayOf(2, "1, 4"),
                arrayOf(5, "1, 4, 9, 16, 25"),
                arrayOf(10, "1, 4, 9, 16, 25, 36, 49, 64, 81, 100")
        )
    }

}
