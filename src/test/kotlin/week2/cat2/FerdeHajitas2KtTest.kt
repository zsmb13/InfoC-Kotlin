package week2.cat2

import org.junit.Assert.assertEquals
import org.junit.Test
import util.captureLastLine
import util.withStdIn
import week2.cat2.ferdehajitas2.main

class FerdeHajitas2KtTest {

    @Test
    fun test() {
        val line = captureLastLine {
            withStdIn("20\n45\n10") {
                main(arrayOf())
            }
        }

        val (x, y) = line.split(", ").map { it.toDouble() }

        assertEquals(39.598, x, 0.1)
        assertEquals(1.143, y, 0.1)
    }

}
