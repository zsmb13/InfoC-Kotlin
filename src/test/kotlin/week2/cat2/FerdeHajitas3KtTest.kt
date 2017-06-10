package week2.cat2

import org.junit.Assert.assertEquals
import org.junit.Test
import util.captureLastLine
import util.withStdIn
import week2.cat2.ferdehajitas3.main

class FerdeHajitas3KtTest {

    @Test
    fun test() {
        val line = captureLastLine {
            withStdIn("20\n45\n9") {
                main(arrayOf())
            }
        }

        val (x, y) = line.split(", ").map { it.toDouble() }

        assertEquals(26.870, x, 0.1)
        assertEquals(9.16, y, 0.1)
    }

}
