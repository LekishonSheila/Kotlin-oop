fun main() {
    val product = Product("Apple", 1.99, 5)
    val totalValue = product.calculateTotalValue()
    println(totalValue)
    val dog = Dog()
    dog.speak()
    dog.move()
    val cat = Cat()
     cat.speak()
     cat.move()
    val vehicle = Vehicle("Toyota", "Corolla", 2023)
    vehicle.drive()



}
//Create a data class named Product with properties for name, price, and quantity.
// Add a method to calculate the total value of the product based on the price and quantity.
data class Product(val name: String, val price: Double, val quantity: Int) {
    fun calculateTotalValue(): Double {
        return price * quantity
    }
}
// Create an interface named Animal with methods for speak and move.
class Dog() {

    fun speak() {
        println("Woof!")
    }

    fun move() {
        println("Running on four legs")
    }
}
// Create a class named Cat that implements the Animal interface.
class Cat (){
     fun speak() {
        println("Meow!")
    }

     fun move() {
        println("Walking on four legs")
    }
}
//Create a class called Vehicle with properties make, model, and year, and a method drive().
// The drive() method should print a message indicating that the vehicle is being driven.
class Vehicle(val make: String, val model: String, val year: Int) {
    fun drive() {
        println("A $make, $model of $year is being driven.")
    }
}



