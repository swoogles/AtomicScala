import com.atomicscala.AtomicTest._
import com.atomicscala.Temperature
import com.atomicscala.BasicMethods
import com.atomicscala.Grid

/*1. Create a Vector filled with Chars, one filled with Ints, and one*/
/*filled with Strings. Sort each Vector and produce the min and max*/
/*for each. Write a for loop for each sorted Vector that appends its*/
/*elements, separated by spaces, to a String.*/

val v1 = Vector('d', 'c', 'b', 'a', 'e')
val v2 = Vector(4, 3, 2, 5, 1)
val v3 = Vector("d", "c", "b", "a", "e")

println("v1.max: " + v1.sorted.max)
println("v2.max: " + v2.sorted.max)
println("v3.max: " + v3.sorted.max)
// Skipping the rest. Bit too tedious for my tastes.


/*2. Create a Vector containing all the Vectors from Exercise 1. Write a*/
/*for loop within a for loop to move through this Vector of Vectors*/
/*and append all the elements to a single String.*/

var bigString = ""
val vecOfVecs = Vector(v1, v2, v3)
for ( curVec <- vecOfVecs ) {
  for ( curEntry <- curVec ) {
    bigString += curEntry + " "
  }
}

println("bigString: " + bigString )

/*3. In the REPL, create a single Vector containing a Char, an Int, a*/
/*String and a Double. What type does this Vector contain? Try to*/
/*find the max of your Vector. Does this make sense?*/

// Output: 
//    error: No implicit Ordering defined for Any.
// It doesn't know how to sort arbitray objects, so throwing an error seems
// like the safe behavior here.


/*4. Modify BasicMethods.scala so the two methods are part of a class.*/
/*Put the class in a package and compile it. Import the resulting*/
/*library into a script and test it.*/

val basicMethods = new BasicMethods
basicMethods.cube(3) is 27
basicMethods.bang("pop") is "pop!"

/*5. Create a package containing the classes in ClassBodies.scala.*/
/*Compile this package, then import it into a script. Modify the*/
/*classes by adding methods that produce results that can be tested*/
/*with AtomicTest.*/

// Skipping this one, as it seems very similar to #4

/*6. Add Kelvin temperature units to Temperature.scala (Kelvin is*/
/*Celsius + 273.15). When writing the new code, call the existing*/
/*methods whenever possible.*/

var temp = new Temperature
/*temp.setKelvin(273.15)*/
/*temp.setCelsius(0)*/
temp.setFahrenheit(32)
println("Kelvin: " + temp.getKelvin )
println("Celsius: " + temp.getCelsius)
println("Fahrenheit: " + temp.getFahrenheit)


/*7. Add a method to TicTacToe.scala that displays the game board*/
/*(hint: use a for loop within a for loop). Call this method*/
/*automatically for each move.*/

val grid = new Grid
grid.play('X', 1, 1) is "successful move"
grid.play('X', 1, 1) is "invalid move"
grid.play('O', 1, 3) is "invalid move"
/*grid.printGrid*/



/*8. Add a method to TicTacToe.scala that determines whether there is*/
/*a winner or if the game is a draw. Call this method automatically*/
/*for each move.*/

