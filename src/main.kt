import java.util.Scanner

fun main(args : Array<String>){
// Scanner named reader
    val reader = Scanner(System.`in`)

// Square
    println("For Shape: Square")
    print("Enter a name: ")
    var name1 : String = reader.next()
    var shape1 : Square = Square(name1)
    print("Enter a length: ")
    var length : Double = reader.nextDouble()
    print("Enter a height: ")
    var height : Double = reader.nextDouble()
    shape1.setDimensions(length, height)
    shape1.printDimensions()
    println("The area of ${shape1.name} = ${shape1.getArea()}")

// Circle
    println()
    println("For shape: Circle")
    print("Enter a name: ")
    var name2 : String = reader.next()
    var shape2 : Circle = Circle(name2)
    print("Enter a radius: ")
    var radius : Double = reader.nextDouble()
    shape2.setDimensions(radius)
    shape2.printDimensions()
    println("The area of ${shape2.name} = ${shape2.getArea()}")

// Triangle
    println()
    println("For shape: Triangle")
    print("Enter a name: ")
    var name3 : String = reader.next()
    var shape3 : Triangle = Triangle(name3)
    print("Enter 1st side length: ")
    var side1 : Double = reader.nextDouble()
    print("Enter 2nd side length: ")
    var side2 : Double = reader.nextDouble()
    print("Enter 3rd side length: ")
    var side3 : Double = reader.nextDouble()
    shape3.setDimensions(side1, side2, side3)
    shape3.printDimensions()
    println("The area of ${shape3.name} = ${shape3.getArea()}")

// Equilateral Triangle
    println()
    println("For shape: Equilateral Triangle")
    print("Enter a name: ")
    var name4 : String = reader.next()
    var shape4 : Equilateraltriangle = Equilateraltriangle(name4)
    print("Enter side length: ")
    var side : Double = reader.nextDouble()
    shape4.setDimensions(side)
    shape4.printDimensions()
    println("The area of ${shape4.name} = ${shape4.getArea()}")

}