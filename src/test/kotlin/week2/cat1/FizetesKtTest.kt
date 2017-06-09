package week2.cat1

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameter
import org.junit.runners.Parameterized.Parameters
import util.captureLastLine
import util.withStdIn
import week2.cat1.fizetes.main

@RunWith(Parameterized::class)
class FizetesKtTest {

    @Parameter(0) lateinit var input: String
    @Parameter(1) lateinit var expected: String

    @Test
    fun test() {
        val out = captureLastLine {
            withStdIn(input) {
                main(arrayOf())
            }
        }

        assertEquals(expected, out)
    }

    companion object {
        @JvmStatic @Parameters
        fun data() = arrayOf(
                arrayOf("99", "Alacsony."),
                arrayOf("100", "Alacsony."),
                arrayOf("101", "Átlagos."),
                arrayOf("500", "Átlagos."),
                arrayOf("999", "Átlagos."),
                arrayOf("1000", "Magas."),
                arrayOf("1001", "Magas.")
        )
    }

}
