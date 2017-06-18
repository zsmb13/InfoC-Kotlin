package week2.cat3

import org.junit.Assert.assertEquals
import org.junit.Test
import util.captureStdOut
import week2.cat3.buszjegyek.main

class BuszjegyekKtTest {

    @Test
    fun test() {
        val out = captureStdOut {
            main(arrayOf())
        }

        val setOfOut = out
                .map(String::trim)
                .toList()
                .flatMap {
                    it.split(" ").map {
                        it.toInt()
                    }
                }.toSet()

        assertEquals(
                setOf(
                        123, 124, 125, 126, 127, 128, 129, 134, 135, 136, 137, 138, 139, 145,
                        146, 147, 148, 149, 156, 157, 158, 159, 167, 168, 169, 178, 179, 189,
                        234, 235, 236, 237, 238, 239, 245, 246, 247, 248, 249, 256, 257, 258,
                        259, 267, 268, 269, 278, 279, 289,
                        345, 346, 347, 348, 349, 356, 357, 358, 359, 367, 368, 369, 378, 379,
                        389,
                        456, 457, 458, 459, 467, 468, 469, 478, 479, 489,
                        567, 568, 569, 578, 579, 589,
                        678, 679, 689,
                        789),
                setOfOut
        )
    }

}
