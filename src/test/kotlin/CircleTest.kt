import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertFailsWith

internal class CircleTest {
    /***
     * tests the getHorizontalRadius function, and checks if the radius is the expected value of 5.0
     */
    @Test
    fun getHorizontalRadius() {
        val myTestCircle: Circle = Circle(Point(0.0, 0.0), 5.0, 5.0)

        assertEquals(5.0, myTestCircle.getHorizontalRadius())
    }

    /***
     * tests the getVerticalRadius function, and checks if the radius is the expected value of 3.0
     */
    @Test
    fun getVerticalRadius() {
        val myTestCircle: Circle = Circle(Point(0.0, 0.0), 3.0, 3.0)

        assertEquals(3.0, myTestCircle.getVerticalRadius())
    }

    /***
     * tests the calculateArea function, and checks if area is equal to zero: then throws illegalArgumentException
     */
    @Test
    fun checkIfAreaIsZero() {
        assertFailsWith<IllegalArgumentException> { Circle(Point(0.0, 0.0), 0.0, 0.0) }
    }

    /***
     * tests the calculateArea function, and checks if the area is the expected value of 78.5398163397
     */
    @Test
    fun calculateArea() {
        val myTestCircle: Circle = Circle(Point(0.0, 0.0), 5.0, 5.0)

        assertEquals(Math.PI * 5.0 * 5.0, myTestCircle.calculateArea())
    }

    /***
     * tests the move function, and checks if the center point has been shifted up 5 units and over 3 units
     */
    @Test
    fun move() {
        val myTestCircle: Circle = Circle(Point(0.0,0.0), 5.0, 5.0)
        myTestCircle.move(3.0, 5.0)

        assertEquals(3.0, myTestCircle.getCenterPoint().getXCoordinate())
        assertEquals(5.0, myTestCircle.getCenterPoint().getYCoordinate())
    }
}