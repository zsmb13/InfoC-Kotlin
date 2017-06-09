package week1.cat2

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameter
import org.junit.runners.Parameterized.Parameters
import week1.cat2.negyszog.Point
import week1.cat2.negyszog.area
import week1.cat2.negyszog.perimeter

@RunWith(Parameterized::class)
class NegyszogKtTest {

    @Parameter(0) lateinit var A: Point
    @Parameter(1) lateinit var B: Point
    @Parameter(2) lateinit var C: Point
    @Parameter(3) lateinit var D: Point

    @JvmField @Parameter(4)
    var perimeter = 0.0

    @JvmField @Parameter(5)
    var area = 0.0

    @Test
    fun perimeter() {
        assertEquals(perimeter, perimeter(A, B, C, D), 0.1)
    }

    @Test
    fun area() {
        assertEquals(area, area(A, B, C, D), 0.1)
    }

    companion object {

        @JvmStatic @Parameters
        fun data() = arrayOf(
                arrayOf(
                        12.0 to 7.0, // A
                        2.0 to 5.0, // B
                        5.0 to 2.0, // C
                        24.0 to 2.0, // D
                        46.4407, // perimeter
                        65.5 // area
                ),
                arrayOf(
                        -2.0 to 1.0,
                        10.54 to -12.0,
                        10.0 to -7.0,
                        2.0 to 2.0,
                        39.2562,
                        49.84
                )
        )
    }

}
