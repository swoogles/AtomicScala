import com.atomicscala.AtomicTest._

val r1 = Range(0,11)
r1 is Range(0,11)

val r2 = Range(0,10).inclusive
r2 is Range(0,10).inclusive

var r3:Int = 0
for ( x <- Range(0,10).inclusive ) {
  r3 += x
}
r3 is 55

var evens:Int = 0
var odds:Int = 0
for ( x <- Range(1,10).inclusive ) {
  if ( x % 2 == 0 ) {
    evens += x
  }
  else {
    odds += x
  }
}
evens is 30
odds is 25
evens + odds is 55

var evens2:Int = 0
var odds2:Int = 0
for ( x <- 0 to 10 ) {
  if ( x % 2 == 0 ) {
    evens2 += x
  }
  else {
    odds2 += x
  }
}
evens2 is 30
odds2 is 25
evens2 + odds2 is 55
