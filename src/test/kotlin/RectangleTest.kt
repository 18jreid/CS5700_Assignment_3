import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertFailsWith

internal class RectangleTest {
    /***
     * tests the getWidth function, checks if width is expected value of 5.0
     */
    @Test
    fun getWidth() {
        val myTestRectangle: Rectangle = Rectangle(Point(0.0, 0.0), Point(5.0, 2.0))

        assertEquals(5.0, myTestRectangle.getWidth())
    }

    /***
     * tests the getWidth function, checks if width is 0.0 and throws IllegalArgumentException
     */
    @Test
    fun getWidthOfZero() {
        assertFailsWith<IllegalArgumentException> { Rectangle(Point(0.0, 0.0), Point(0.0, 1.0)) }
    }

    /***
     * tests the getHeight function, checks if height is expected value of 2.0
     */
    @Test
    fun getHeight() {
        val myTestRectangle: Rectangle = Rectangle(Point(0.0, 0.0), Point(5.0, 2.0))

        assertEquals(2.0, myTestRectangle.getHeight())
    }

    /***
     * tests the getHeight function, checks if height is 0.0 and throws IllegalArgumentException
     */
    @Test
    fun getHeightOfZero() {
        assertFailsWith<IllegalArgumentException> { Rectangle(Point(0.0, 0.0), Point(1.0, 0.0)) }
    }

    /***
     * tests the calculateArea function, and checks if area calculated is 25 units squared
     */
    @Test
    fun calculateArea() {
        val myTestRectangle: Rectangle = Rectangle(Point(0.0, 0.0), Point(5.0, 5.0))

        assertEquals(25.0, myTestRectangle.calculateArea())
    }

    /***
     * tests the move function, and checks if the rectangle moved upwards 10 units and over 5 units
     */
    @Test
    fun move() {
        val myTestRectangle: Rectangle = Rectangle(Point(0.0, 0.0), Point(1.0, 1.0))
        myTestRectangle.move(10.0, 5.0)

        assertEquals(10.0, myTestRectangle.getPointOne().getXCoordinate())
        assertEquals(5.0, myTestRectangle.getPointOne().getYCoordinate())

        assertEquals(11.0, myTestRectangle.getPointTwo().getXCoordinate())
        assertEquals(6.0, myTestRectangle.getPointTwo().getYCoordinate())
    }
}