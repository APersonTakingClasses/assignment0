class Equilateraltriangle(_name: String) : Triangle(_name) {
    // Dimensions
    // name is already set by superclass
    private var side : Double = 0.0

    fun setDimensions(_side : Double){
        side = _side
    }

    override fun printDimensions() {
        println("The sides of $name = $side")
    }

    override fun getArea(): Double {
        var perimeter = side * 3
        var temp = perimeter*(perimeter-side)*(perimeter-side)*(perimeter-side)
        temp = java.lang.Math.sqrt(temp)
        return temp
    }
}