import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertFailsWith

internal class TriangleTest {
    /***
     * tests the calculateArea function, and checks if the area is equal to 20
     */
    @Test
    fun calculateArea() {
        val myTestTriangle: Triangle = Triangle(Point(0.0, 0.0), Point(0.0, 4.0), Point(10.0, 0.0))

        assertEquals(20.0, myTestTriangle.calculateArea())
    }

    /***
     * tests the calculateArea function, and checks if the area is 0: if so, throws IllegalArgumentException
     */
    @Test
    fun checkIfAreaIsZero() {
        assertFailsWith<java.lang.IllegalArgumentException> { Triangle(Point(0.0, 0.0), Point(0.0, 1.0), Point(0.0, 0.0)) }
    }

    /***
     * tests the move function, and checks if the triangles vertices moved up 3 units, and over 1 unit
     */
    @Test
    fun move() {
        val myTestTriangle: Triangle = Triangle(Point(0.0, 0.0), Point(1.0, 1.0), Point(1.0, 0.0))
        myTestTriangle.move(1.0, 3.0)

        assertEquals(1.0, myTestTriangle.getVertexOne().getXCoordinate())
        assertEquals(2.0, myTestTriangle.getVertexTwo().getXCoordinate())
        assertEquals(2.0, myTestTriangle.getVertexThree().getXCoordinate())

        assertEquals(3.0, myTestTriangle.getVertexOne().getYCoordinate())
        assertEquals(4.0, myTestTriangle.getVertexTwo().getYCoordinate())
        assertEquals(3.0, myTestTriangle.getVertexThree().getYCoordinate())
    }
}