import kotlin.math.*
fun main() {
    var point1 = Point(10,21)
    println(point1)
    point1.moveXSymmetrically()
    point1.moveYSymmetrically()
    println(point1)
}

interface TwoDPlane {
    fun moveXSymmetrically()
    fun moveYSymmetrically()
}

open class Point(var x: Int, var y: Int) {
    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            if (x == other)
                return true
        }
        return false
    }
    override fun toString(): String {
        return "X: $x, Y: $y"
    }

    fun moveXSymmetrically() {
        x = -x
    }
    fun moveYSymmetrically() {
        y = -y
    }

}