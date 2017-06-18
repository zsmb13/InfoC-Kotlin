package week2.cat3

import org.junit.Assert.assertEquals
import org.junit.Test
import util.captureStdOut
import week2.cat3.sakktabla.main

class SakktablaKtTest {

    @Test
    fun test() {
        val out = captureStdOut {
            main(arrayOf())
        }.joinToString(separator = "\n").trimIndent()

        assertEquals(
                """
                XX  XX  XX  XX
                XX  XX  XX  XX
                  XX  XX  XX  XX
                  XX  XX  XX  XX
                XX  XX  XX  XX
                XX  XX  XX  XX
                  XX  XX  XX  XX
                  XX  XX  XX  XX
                XX  XX  XX  XX
                XX  XX  XX  XX
                  XX  XX  XX  XX
                  XX  XX  XX  XX
                XX  XX  XX  XX
                XX  XX  XX  XX
                  XX  XX  XX  XX
                  XX  XX  XX  XX
                """.trimIndent(),
                out
        )
    }

}
