import java.lang.Math.PI

class Circle(_name: String) : Shape(_name) {
    // Dimensions
    // name is already set by superclass
    private var r : Double = 0.0

    fun setDimensions(_radius: Double){
        r = _radius
    }

    override fun printDimensions(){
        println("The radius of $name = $r")
    }

    override fun getArea(): Double {
        return (PI * r * r)
    }
}