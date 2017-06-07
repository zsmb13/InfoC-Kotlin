package week1.cat2

import org.junit.Assert.assertEquals
import org.junit.Test
import util.assertEqualsSorted
import week1.cat2.haromszog.altitudes
import week1.cat2.haromszog.angles
import week1.cat2.haromszog.area
import week1.cat2.haromszog.perimeter

class HaromszogKtTest {

    companion object {
        private val A1 = 0.0 to 0.0
        private val B1 = 5.0 to 8.0
        private val C1 = 10.0 to 7.0

        private val PERIMETER1 = 26.7396
        private val AREA1 = 22.5
        private val ANGLES1 = arrayOf(46.3019799, 23.0025939, 110.695446)
        private val ALTITUDES1 = arrayOf(4.769991, 8.825225, 3.686530)

        private val A2 = 1.0 to 2.0
        private val B2 = -3.0 to 4.0
        private val C2 = 5.0 to 16.0

        private val PERIMETER2 = 33.4546
        private val AREA2 = 32.0
        private val ANGLES2 = arrayOf(17.7446748, 79.3804377, 82.8749073)
        private val ALTITUDES2 = arrayOf(14.310822, 4.437603, 4.395544)
    }

    @Test
    fun testPerimeter1() {
        val result = perimeter(A1, B1, C1)
        assertEquals(PERIMETER1, result, 0.1)
    }

    @Test
    fun testPerimeter2() {
        val result = perimeter(A2, B2, C2)
        assertEquals(PERIMETER2, result, 0.1)
    }

    @Test
    fun testArea1() {
        val result = area(A1, B1, C1)
        assertEquals(AREA1, result, 0.1)
    }

    @Test
    fun testArea2() {
        val result = area(A2, B2, C2)
        assertEquals(AREA2, result, 0.1)
    }

    @Test
    fun testAngles1() {
        val result = angles(A1, B1, C1)
        assertEqualsSorted(ANGLES1, result, 0.1)
    }

    @Test
    fun testAngles2() {
        val result = angles(A2, B2, C2)
        assertEqualsSorted(ANGLES2, result, 0.1)
    }

    @Test
    fun testAltitudes1() {
        val result = altitudes(A1, B1, C1)
        assertEqualsSorted(ALTITUDES1, result, 0.1)
    }

    @Test
    fun testAltitudes2() {
        val result = altitudes(A2, B2, C2)
        assertEqualsSorted(ALTITUDES2, result, 0.1)
    }

}
