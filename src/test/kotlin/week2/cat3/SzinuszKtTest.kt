package week2.cat3

import org.junit.Assert.assertEquals
import org.junit.Test
import util.captureStdOut
import week2.cat3.szinusz.main

class SzinuszKtTest {

    @Test
    fun test() {
        val out = captureStdOut {
            main(arrayOf())
        }

        val jointOut = out
                .filter(String::isNotEmpty)
                .joinToString(separator = "\n")

        assertEquals(
                """
                          X
                             X
                                X
                                  X
                                   X
                                   X
                                  X
                                X
                             X
                          X
                      X
                   X
                 X
                X
                X
                 X
                   X
                      X
                         X
                """.trimIndent(),
                jointOut
        )
    }

}