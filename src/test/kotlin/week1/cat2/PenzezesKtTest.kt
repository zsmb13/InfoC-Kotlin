package week1.cat2

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameter
import org.junit.runners.Parameterized.Parameters
import util.captureLastLine
import util.withStdIn
import week1.cat2.penzezes.main

@RunWith(Parameterized::class)
class PenzezesKtTest {

    @Parameter(0)
    lateinit var name: String

    @Parameter(1)
    lateinit var input: String
    @Parameter(2)
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
        @JvmStatic @Parameters(name = "{0}")
        fun data() = arrayOf(
                arrayOf("Empty test",
                        "0 0 0", "Összeg: 0"),
                arrayOf("Single 100",
                        "1 0 0", "Összeg: 100"),
                arrayOf("Single 200",
                        "0 1 0", "Összeg: 200"),
                arrayOf("Single 500",
                        "0 0 1", "Összeg: 500"),
                arrayOf("One of each",
                        "1 1 1", "Összeg: 800"),
                arrayOf("Some of each",
                        "5 7 3", "Összeg: 3400")
        )
    }

}
