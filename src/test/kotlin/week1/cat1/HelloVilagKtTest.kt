package week1.cat1

import org.junit.Assert.assertEquals
import org.junit.Test
import util.captureStdOut
import week1.cat1.hello_vilag.main

class HelloVilagKtTest {

    @Test
    fun main() {
        val out = captureStdOut {
            main(arrayOf())
        }
        assertEquals("Hello World", out.first())
    }

}
