import com.atomicscala.AtomicTest._

def matchColor(color:String):String = {
  color match {
    case "red" => "RED"
    case "blue" => "BLUE"
    case "green" => "GREEN"
    case _ => "UNKNOWN COLOR: " + color
  }
}
matchColor("white") is "UNKNOWN COLOR: white"

matchColor("blue") is "BLUE"

// This version might be ever so slightly more complicated, but it's hardly 
// an example that really sells me on pattern matching
def matchColorWithoutPattern(color:String):String = {
  if (color == "red")
    "RED"
  else if (color == "blue")
    "BLUE"
  else if (color == "green")
    "GREEN"
  else 
    "UNKNOWN COLOR: " + color

}
matchColorWithoutPattern("white") is "UNKNOWN COLOR: white"

matchColorWithoutPattern("blue") is "BLUE"


def oneOrTheOtherWithoutPattern(exp:Boolean):String = {
  if(exp) {
    "True!" // No 'return' necessary
  }
  else {
    "It's false"
  }
}

val vw = Vector(1)
val vw2 = Vector(3, 4)
oneOrTheOtherWithoutPattern(vw == vw.reverse) is "True!"
oneOrTheOtherWithoutPattern(vw2 == vw2.reverse) is
"It's false"

def oneOrTheOther(exp:Boolean):String = {
  exp match {
    case true => "True!"
    case false => "It's false"
  }
}

val v = Vector(1)
val v2 = Vector(3, 4)
oneOrTheOther(v == v.reverse) is "True!"
oneOrTheOther(v2 == v2.reverse) is
"It's false"

def checkTruthWithoutPattern( exp1:Boolean, exp2:Boolean):String = {
  if(exp1 && exp2) {
    "Both are true"
  }
  else if(!exp1 && !exp2) {
    "Both are false"
  }
  else if(exp1) {
    "First: true, second: false"
  }
  else {
    "First: false, second: true"
  }
}

checkTruthWithoutPattern(true || false, true) is "Both are true"
checkTruthWithoutPattern(1 > 0 && -1 < 0, 1 == 2) is "First: true, second: false"
checkTruthWithoutPattern(1 >= 2, 1 >= 1) is "First: false, second: true"
checkTruthWithoutPattern(true && false,false && true) is "Both are false"

def checkTruth( exp1:Boolean, exp2:Boolean):String = {
  (exp1, exp2) match {
    case (true, true) => "Both are true"
    case (false,false) => "Both are false"
    case (true,false) => "First: true, second: false" 
    case (false,true) => "First: false, second: true"
  }
}

checkTruth(true || false, true) is "Both are true"
checkTruth(1 > 0 && -1 < 0, 1 == 2) is "First: true, second: false"
checkTruth(1 >= 2, 1 >= 1) is "First: false, second: true"
checkTruth(true && false,false && true) is "Both are false"


//Create a method forecast that represents the percentage of
//cloudiness, and use it to produce a “weather forecast” string such
//as “Sunny” (100), “Mostly Sunny” (80), “Partly Sunny” (50), “Mostly
//Cloudy” (20), and “Cloudy” (0). For this exercise, only match for the
//legal values 100, 80, 50, 20, and 0 (we will revisit this exercise later).
//Everything else should produce “Unknown.” Satisfy the following
//tests:

def forecast(temp:Int):String = {
  temp match {
    case 100 => "Sunny"
    case 80 => "Mostly Sunny"
    case 50 => "Partly Sunny"
    case 20 => "Mostly Cloudy"
    case 0 => "Cloudy"
    case _ => "Unknown"
  }
}

forecast(100) is "Sunny"
forecast(80) is "Mostly Sunny"
forecast(50) is "Partly Sunny"
forecast(20) is "Mostly Cloudy"
forecast(0) is "Cloudy"
forecast(15) is "Unknown"

val weatherData = Vector(100,80,50,20,0,15)

for ( condition <- weatherData ) {
  forecast(condition)
}
