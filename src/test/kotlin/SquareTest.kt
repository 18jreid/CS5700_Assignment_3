import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertFailsWith

internal class SquareTest {
    /***
     * tests the getWidth function, checks if width is expected value of 5.0
     */
    @Test
    fun getWidth() {
        val myTestSquare: Square = Square(Point(0.0, 0.0), Point(5.0, 5.0))

        assertEquals(5.0, myTestSquare.getWidth())
    }

    /***
     * tests the getWidth function, checks if width is 0.0 and throws IllegalArgumentException
     */
    @Test
    fun getWidthOfZero() {
        assertFailsWith<IllegalArgumentException> { Square(Point(0.0, 0.0), Point(0.0, 0.0)) }
    }

    /***
     * tests the getHeight function, checks if height is expected value of 2.0
     */
    @Test
    fun getHeight() {
        val myTestSquare: Square = Square(Point(0.0, 0.0), Point(2.0, 2.0))

        assertEquals(2.0, myTestSquare.getHeight())
    }

    /***
     * tests the getHeight function, checks if height is 0.0 and throws IllegalArgumentException
     */
    @Test
    fun getHeightOfZero() {
        assertFailsWith<IllegalArgumentException> { Square(Point(0.0, 0.0), Point(0.0, 0.0)) }
    }

    @Test
    fun checkIfSquare() {
        assertFailsWith<IllegalArgumentException> { Square(Point(0.0, 0.0), Point(10.0, 5.0)) }
    }

    /***
     * tests the calculateArea function, and checks if area calculated is 25 units squared
     */
    @Test
    fun calculateArea() {
        val myTestSquare: Square = Square(Point(0.0, 0.0), Point(5.0, 5.0))

        assertEquals(25.0, myTestSquare.calculateArea())
    }

    /***
     * tests the move function, and checks if the square moved upwards 10 units and over 5 units
     */
    @Test
    fun move() {
        val myTestSquare: Square = Square(Point(0.0, 0.0), Point(1.0, 1.0))
        myTestSquare.move(10.0, 5.0)

        assertEquals(10.0, myTestSquare.getPointOne().getXCoordinate())
        assertEquals(5.0, myTestSquare.getPointOne().getYCoordinate())

        assertEquals(11.0, myTestSquare.getPointTwo().getXCoordinate())
        assertEquals(6.0, myTestSquare.getPointTwo().getYCoordinate())
    }
}