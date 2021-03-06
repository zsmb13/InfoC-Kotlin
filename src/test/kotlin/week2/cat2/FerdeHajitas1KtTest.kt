package week2.cat2

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameter
import org.junit.runners.Parameterized.Parameters
import week2.cat2.ferdehajitas1.getDist
import week2.cat2.ferdehajitas1.getX
import week2.cat2.ferdehajitas1.getY

@RunWith(Parameterized::class)
class FerdeHajitas1KtTest {

    @JvmField @Parameter(0) var v = 0.0
    @JvmField @Parameter(1) var alpha = 0.0
    @JvmField @Parameter(2) var t = 0.0

    @JvmField @Parameter(3) var x = 0.0
    @JvmField @Parameter(4) var y = 0.0
    @JvmField @Parameter(5) var dist = 0.0

    @Test
    fun `x calculation`() {
        assertEquals(x, getX(v, alpha, t), 0.1)
    }

    @Test
    fun `y calculation`() {
        assertEquals(y, getY(v, alpha, t), 0.1)
    }

    @Test
    fun `distance calculation`() {
        assertEquals(dist, getDist(x, y), 0.1)
    }

    companion object {
        @JvmStatic @Parameters
        fun data() = arrayOf(
                // v, alpha, t
                // x, y, dist
                arrayOf(50.0, 70.0, 6.0,
                        102.606, 105.328, 147.044),
                arrayOf(100.0, 20.0, 3.0,
                        281.908, 58.461, 287.906)
        )
    }

}