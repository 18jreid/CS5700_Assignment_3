class Point(private var xCoordinate: Double, private var yCoordinate: Double) {
    /***
     * returns the x coordinate for the point
     */
    fun getXCoordinate(): Double {
        return this.xCoordinate
    }

    /***
     * returns the y coordinate for the point
     */
    fun getYCoordinate(): Double {
        return this.yCoordinate
    }

    /***
     * moves the point in the desired deltaX and deltaY direction
     */
    fun movePoint(deltaX: Double, deltaY: Double) {
        this.xCoordinate += deltaX
        this.yCoordinate += deltaY
    }

    /***
     * clones the current point and returns a new one in the identical coordinates
     *
     * returns: new Point
     */
    fun clonePoint(): Point {
        return Point(this.xCoordinate, this.yCoordinate);
    }
}