import java.util.Scanner

fun main(args : Array<String>){
// Scanner named reader
    val reader = Scanner(System.`in`)

// Square
    println("For Shape: Square")
    print("Enter a name: ")
    val name1 : String = reader.next()
    val shape1 = Square(name1)
    print("Enter a length: ")
    val length : Double = reader.nextDouble()
    print("Enter a height: ")
    val height : Double = reader.nextDouble()
    shape1.setDimensions(length, height)
    shape1.printDimensions()
    println("The area of ${shape1.name} = ${shape1.getArea()}")

// Circle
    println()
    println("For shape: Circle")
    print("Enter a name: ")
    val name2 : String = reader.next()
    val shape2 = Circle(name2)
    print("Enter a radius: ")
    val radius : Double = reader.nextDouble()
    shape2.setDimensions(radius)
    shape2.printDimensions()
    println("The area of ${shape2.name} = ${shape2.getArea()}")

// Triangle
    println()
    println("For shape: Triangle")
    print("Enter a name: ")
    val name3 : String = reader.next()
    val shape3 = Triangle(name3)
    print("Enter 1st side length: ")
    val side1 : Double = reader.nextDouble()
    print("Enter 2nd side length: ")
    val side2 : Double = reader.nextDouble()
    print("Enter 3rd side length: ")
    val side3 : Double = reader.nextDouble()
    shape3.setDimensions(side1, side2, side3)
    shape3.printDimensions()
    println("The area of ${shape3.name} = ${shape3.getArea()}")

// Equilateral Triangle
    println()
    println("For shape: Equilateral Triangle")
    print("Enter a name: ")
    val name4 : String = reader.next()
    val shape4 = Equilateraltriangle(name4)
    print("Enter side length: ")
    val side : Double = reader.nextDouble()
    shape4.setDimensions(side)
    shape4.printDimensions()
    println("The area of ${shape4.name} = ${shape4.getArea()}")

}