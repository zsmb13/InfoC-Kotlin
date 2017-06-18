package week2.cat3

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameter
import org.junit.runners.Parameterized.Parameters
import util.assertEqualsWithDelta
import util.captureLastLine
import util.withStdIn
import week2.cat3.szogek.main

@RunWith(Parameterized::class)
class SzogekKtTest {

    @Parameter(0)
    lateinit var input: String
    @Parameter(1)
    lateinit var expectedDeg: List<Double>
    @Parameter(2)
    lateinit var expectedRad: List<Double>

    @Test
    fun test() {
        val out = captureLastLine {
            withStdIn(input) {
                main(arrayOf())
            }
        }

        val numericOut = out
                .split(",")
                .filter(String::isNotEmpty)
                .map {
                    val deg = it.substringBefore('(').toDouble()
                    val rad = it.substringAfter('(').substringBefore(')').toDouble()
                    Pair(deg, rad)
                }

        assertEqualsWithDelta(expectedDeg, numericOut.map { it.first }, 0.01)
        assertEqualsWithDelta(expectedRad, numericOut.map { it.second }, 0.01)
    }

    companion object {
        @JvmStatic @Parameters
        fun data() = arrayOf(
                arrayOf("11.3 14.9",
                        listOf(11.3, 12.3, 13.3, 14.3),
                        listOf(0.197, 0.215, 0.232, 0.249)),
                arrayOf("180 176",
                        listOf(176.0, 177.0, 178.0, 179.0, 180.0),
                        listOf(3.07, 3.09, 3.11, 3.12, 3.14))
        )
    }

}
