val myRange = Range(0,10,2)
println("myRange: " + myRange)

val myString:String = "This is an experiment."
println("String split by spaces: " + myString.split(" ") )

var s1:String = "Sally"
var s2:String = "Sally"
if ( s1.equals(s2) ) {
  println("s1 and s2 are equal")
}
else {
  println("s1 and s2 are not equal")
}

s2 = "Sam"
if ( s1.equals(s2) ) {
  println("s1 and s2 are equal")
}
else {
  println("s1 and s2 are not equal")
}

var s3 = s1.toUpperCase
println("s3: " + s3)
if ( s1.equals(s3) ) {
  println("s1 and s3 are equal")
}
else {
  println("s1 and s3 are not equal")
}
