import kotlin.math.pow
import kotlin.math.sqrt

class EquilateralTriangle(_name: String) : Triangle(_name){

    var side: Double = 0.0

    fun setDimensions(_side: Double){
        side = _side
    }

    override fun printDimensions() {
        println("Side: $side")
    }

    override fun getArea(): Double {
        val s = (side * 3) / 2
        return sqrt(s * (s-side).pow(3))
    }
}