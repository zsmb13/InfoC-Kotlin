package week2.cat2

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameter
import org.junit.runners.Parameterized.Parameters
import util.captureLastLine
import util.withStdIn
import week2.cat2.negyzetszamok2.main

@RunWith(Parameterized::class)
class Negyzetszamok2KtTest {

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
                arrayOf(48, "1, 4, 9, 16, 25, 36"),
                arrayOf(49, "1, 4, 9, 16, 25, 36"),
                arrayOf(50, "1, 4, 9, 16, 25, 36, 49"),
                arrayOf(100, "1, 4, 9, 16, 25, 36, 49, 64, 81")
        )
    }

}
