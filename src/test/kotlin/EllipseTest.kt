import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertFailsWith

internal class EllipseTest {
    /***
     * tests the getHorizontalRadius function, and checks if the radius is the expected value of 5.0
     */
    @Test
    fun getHorizontalRadius() {
        val myTestEllipse: Ellipse = Ellipse(Point(0.0, 0.0), 5.0, 2.0)

        assertEquals(5.0, myTestEllipse.getHorizontalRadius())
    }

    /***
     * tests the getVerticalRadius function, and checks if the radius is the expected value of 3.0
     */
    @Test
    fun getVerticalRadius() {
        val myTestEllipse: Ellipse = Ellipse(Point(0.0, 0.0), 5.0, 3.0)

        assertEquals(3.0, myTestEllipse.getVerticalRadius())
    }

    /***
     * tests the calculateArea function, and checks if the area is the expected value of 47.1238898038
     */
    @Test
    fun calculateArea() {
        val myTestEllipse: Ellipse = Ellipse(Point(0.0, 0.0), 3.0, 5.0)

        assertEquals(Math.PI * 3.0 * 5.0, myTestEllipse.calculateArea())
    }

    /***
     * tests the calculateArea function, and checks if area is equal to zero: then throws illegalArgumentException
     */
    @Test
    fun checkIfAreaIsZero() {
        assertFailsWith<IllegalArgumentException> { Ellipse(Point(0.0, 0.0), 0.0, 5.0) }
    }

    /***
     * tests the move function, and checks if the center point has been shifted up 5 units and over 3 units
     */
    @Test
    fun move() {
        val myTestEllipse: Ellipse = Ellipse(Point(0.0,0.0), 3.0, 5.0)
        myTestEllipse.move(3.0, 5.0)

        assertEquals(3.0, myTestEllipse.getCenterPoint().getXCoordinate())
        assertEquals(5.0, myTestEllipse.getCenterPoint().getYCoordinate())
    }
}