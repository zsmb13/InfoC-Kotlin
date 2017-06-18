package week2.cat3

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameter
import org.junit.runners.Parameterized.Parameters
import util.captureLastLine
import util.withStdIn
import week2.cat3.sorozatnovekvolepesekkel.main

@RunWith(Parameterized::class)
class SorozatNovekvoLepesekkelKtTest {

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
                arrayOf("4 23", "4 5 7 10 14 19"),
                arrayOf("23 4", "4 5 7 10 14 19")
        )
    }

}
