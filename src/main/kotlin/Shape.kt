abstract class Shape {
    /***
     * Calculates the area of the given shape (unique based off of what shape it is)
     */
    open fun calculateArea(): Double? {return null}
    /***
     * moves the shape in the desired deltaX and deltaY direction
     */

    open fun move(deltaX: Double, deltaY: Double) {}
}