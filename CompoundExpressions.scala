val a = 5
val b = 8
val c = 6
if ( a <= c ) {
  println("A is less than or equal to C.")
}
if ( b <= c ) {
  println("B is less than or equal to C.")
}

if ( a <= c && b <= c) {
  println("Both A and B are less than or equal to C.")
}
else if ( a <= c || b <= c ) {
  println("Either A or B is less than or equal to C.")
}

val doActivity = isOpen && goodTemperature
println(activity + ":" + isOpen + " && " +
goodTemperature + " = " + doActivity)
/* Output
(run 4 times, once for each activity):
swimming:false && false = false
walking:true && true = true
biking:true && false = false
couch:true && true = true
*/
