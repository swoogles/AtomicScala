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

// CompoundExpressions3.scala
val activity = "couch"
val temperature = 40
val hour = 10
val isOpen = {
  if(activity == "swimming" ) {
      val opens = 9
      val closes = 20
      (hour >= opens && hour <= closes)
  } else {
    true
  }
}
val goodTemperature = {
  if (activity == "swimming") {
    val minTemp = 55
    val maxTemp = 150
    (temperature >= minTemp && temperature <= maxTemp)
  }
  else if ( activity == "walking" ||
            activity == "biking" )
  {
    val minTemp = 15
    val maxTemp = 110
    (temperature >= minTemp && temperature <= maxTemp)
  }
  else {
    true
    }
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

