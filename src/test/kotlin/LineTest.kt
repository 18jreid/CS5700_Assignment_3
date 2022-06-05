import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class LineTest {
    /***
     * tests the getSlope function, by calculating the slope of the line and comparing it to the expected value of 1.0
     */
    @Test
    fun getSlope() {
        val testLine: Line = Line(Point(0.0, 0.0), Point(1.0, 1.0))
        assertEquals(1.0, testLine.getSlope())
    }

    /***
     * tests the getSlope function, by calculating the slope of the line and comparing it to the expected value of 5.0]
     */
    @Test
    fun getSlope1() {
        val testLine: Line = Line(Point(0.0, 0.0), Point(2.0, 10.0))
        assertEquals(5.0, testLine.getSlope())
    }

    /***
     * tests the getLength function by calculating the length of the line and comparing it to the expected value of 1.0
     */
    @Test
    fun getLength() {
        val testLine: Line = Line(Point(0.0, 0.0), Point(0.0, 1.0))
        assertEquals(1.0, testLine.getLength())
    }

    /***
     * tests the getLength function by calculating the length of the line and comparing it to the expected value of 10.6
     */
    @Test
    fun getLength1() {
        val testLine: Line = Line(Point(0.0, 0.0), Point(7.5, 0.0))
        assertEquals(7.5, testLine.getLength())
    }

    /***
     * tests the moveLine function by checking if the line moved to the correct new location
     */
    @Test
    fun moveLine() {
        val testLine: Line = Line(Point(0.0, 0.0), Point(10.0, 10.0))
        testLine.moveLine(40.0, -20.0)

        assertEquals(40.0, testLine.getStartPoint().getXCoordinate())
        assertEquals(-20.0, testLine.getStartPoint().getYCoordinate())

        assertEquals(50.0, testLine.getEndPoint().getXCoordinate())
        assertEquals(-10.0, testLine.getEndPoint().getYCoordinate())
    }
}