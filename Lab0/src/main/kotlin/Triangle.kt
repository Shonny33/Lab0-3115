import kotlin.math.sqrt

open class Triangle(_name: String) : Shape(_name){

    var side_a: Double = 0.0;
    var side_b: Double = 0.0;
    var side_c: Double = 0.0;

    fun setDimensions(_side_a: Double, _side_b: Double, _side_c: Double){
        side_a = _side_a
        side_b = _side_b
        side_c = _side_c
    }

    override fun printDimensions() {
        println("Side_a: $side_a, Side_b: $side_b, Side_c: $side_c")
    }

    override fun getArea(): Double {
        val s = (side_a + side_b + side_c) / 2
        return sqrt(s * (s - side_a) * (s - side_b) * (s - side_c))
    }
}