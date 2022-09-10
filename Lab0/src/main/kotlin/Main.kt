import java.util.*

fun main(args: Array<String>) {

    var square: Square = Square("Square")
    var circle: Circle = Circle("Circle")
    var triangle: Triangle = Triangle("Triangle")
    var equilateralTriangle: EquilateralTriangle = EquilateralTriangle("EquilateralTriangle")

    val reader = Scanner(System.`in`)

    println("Enter Square dimensions (W H):")

    var width = reader.nextDouble()
    var height = reader.nextDouble()

    square.setDimensions(width, height)

    println("Enter Circle dimensions (R):")

    var radius = reader.nextDouble()

    circle.setDimensions(radius)

    println("Enter Triangle dimensions (A B C):")

    var a = reader.nextDouble()
    var b = reader.nextDouble()
    var c = reader.nextDouble()

    triangle.setDimensions(a, b, c)

    println("Enter EquilateralTriangle dimensions (1S):")

    var side = reader.nextDouble()

    equilateralTriangle.setDimensions(side)

    println("${square.name} Height: ${square.height} Width: ${square.length} Area: ${square.getArea()}")
    println("${circle.name} Radius: ${circle.radius} Area: ${circle.getArea()}")
    println("${triangle.name} SideA: ${triangle.side_a} SideB: ${triangle.side_b} SideC: ${triangle.side_c} Area: ${triangle.getArea()}")
    println("${equilateralTriangle.name} Side: ${equilateralTriangle.side} Area: ${equilateralTriangle.getArea()}")
}