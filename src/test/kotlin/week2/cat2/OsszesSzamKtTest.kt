package week2.cat2

import org.junit.Assert.assertEquals
import org.junit.Test
import util.captureStdOut
import week2.cat2.osszesszam.main

class OsszesSzamKtTest {

    @Test
    fun test() {
        val out = captureStdOut { main(arrayOf()) }
                .filter { it.isNotEmpty() }

        val expected = setOf(
                4444, 4445, 4446, 4454, 4455, 4456, 4464, 4465, 4466, 4544, 4545, 4546, 4554,
                4555, 4556, 4564, 4565, 4566, 4644, 4645, 4646, 4654, 4655, 4656, 4664, 4665, 4666,
                5444, 5445, 5446, 5454, 5455, 5456, 5464, 5465, 5466, 5544, 5545, 5546, 5554,
                5555, 5556, 5564, 5565, 5566, 5644, 5645, 5646, 5654, 5655, 5656, 5664, 5665, 5666,
                6444, 6445, 6446, 6454, 6455, 6456, 6464, 6465, 6466, 6544, 6545, 6546, 6554,
                6555, 6556, 6564, 6565, 6566, 6644, 6645, 6646, 6654, 6655, 6656, 6664, 6665, 6666)

        val numbers = out.map { it.toInt() }

        assertEquals(expected, numbers.toSet())
    }

}
