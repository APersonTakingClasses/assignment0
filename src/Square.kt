open class Square(_name: String): Shape(_name) {
    // Dimensions
    // name is already set by superclass
    private var l : Double = 0.0
    private var h : Double = 0.0

    fun setDimensions(_length: Double, _height : Double){
        l = _length
        h = _height
    }

    override fun printDimensions(){
        println("The length of $name = $l")
        println("The height of $name = $h ")
    }

    override fun getArea(): Double {
        return l * h ;
    }


}