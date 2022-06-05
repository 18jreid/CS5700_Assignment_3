import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PointTest {
    /***
     * tests the movePoint function, by moving the point in the positive direction
     */
    @Test
    fun movePointPositiveDirection() {
        val myTestPoint: Point = Point(0.0, 0.0)

        // Move point 1 unit in x direction and 1 unit in y direction
        myTestPoint.movePoint(1.0, 1.0)
        assertEquals(1.0, myTestPoint.getYCoordinate())
        assertEquals(1.0, myTestPoint.getYCoordinate())
    }

    /***
     * tests the movePoint function, by moving the point in the negative direction
     */
    @Test
    fun movePointNegativeDirection() {
        val myTestPoint: Point = Point(0.0, 0.0)

        // Move point 1 unit in x direction and 1 unit in y direction
        myTestPoint.movePoint(-1.0, -1.0)
        assertEquals(-1.0, myTestPoint.getYCoordinate())
        assertEquals(-1.0, myTestPoint.getYCoordinate())
    }

    /***
     * tests the clonePoint function, by checking if the new cloned points has the same x and y coordinates as the test point
     */
    @Test
    fun clonePoint() {
        val myTestPoint: Point = Point(0.0, 0.0)

        // Move point -1 units in x direction and -1 units in y direction
        val myClonedPoint = myTestPoint.clonePoint()
        assertEquals(myTestPoint.getXCoordinate(), myClonedPoint.getXCoordinate())
        assertEquals(myTestPoint.getYCoordinate(), myClonedPoint.getYCoordinate())
    }
}