import java.lang.Math.sqrt

open class Triangle(_name : String) : Shape(_name) {
    // Dimensions
    // name is already set by superclass
    private var side1 : Double = 0.0
    private var side2 : Double = 0.0
    private var side3 : Double = 0.0

    open fun setDimensions(_side1:Double, _side2:Double, _side3: Double){
        side1 = _side1
        side2 = _side2
        side3 = _side3
    }

    override fun printDimensions(){
        println("The 1st side of $name = $side1")
        println("The 2nd side of $name = $side2")
        println("The 3rd side of $name = $side3")
    }

    override fun getArea(): Double{
        var perimeter = side1 + side2 + side3
        var temp = perimeter*(perimeter-side1)*(perimeter-side2)*(perimeter-side3)
        temp = java.lang.Math.sqrt(temp)
        return temp
    }
}