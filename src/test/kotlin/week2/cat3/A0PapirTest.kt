package week2.cat3

import org.junit.Test
import util.assertEqualsWithDelta
import util.captureStdOut
import week2.cat3.a0papir.main

class A0PapirTest {

    @Test
    fun test() {
        val out = captureStdOut {
            main(arrayOf())
        }

        val outSizes = out
                .filter(String::isNotEmpty)
                .map {
                    val pieces = it.split(" ")
                    Pair(pieces[0].toDouble(), pieces[2].toDouble())
                }
                .toList()

        val expected = listOf(
                840.896415 to 1189.207115,
                594.603558 to 840.896415,
                420.448208 to 594.603558,
                297.301779 to 420.448208,
                210.224104 to 297.301779,
                148.650889 to 210.224104,
                105.112052 to 148.650889
        )

        assertEqualsWithDelta(expected.map { it.first }, outSizes.map { it.first }, 0.000001)
        assertEqualsWithDelta(expected.map { it.second }, outSizes.map { it.second }, 0.000001)
    }

}
