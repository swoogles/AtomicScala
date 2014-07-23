import com.atomicscala.AtomicTest._

// 1. If it's a palindrome

def isPalindrome(checkString:String):Boolean = {
  checkString == checkString.reverse
}
  

isPalindrome("mom") is true
isPalindrome("dad") is true
isPalindrome("street") is false

def isPalIgnoreCase(checkString:String):Boolean = {
  isPalindrome(checkString.toUpperCase)
}

isPalIgnoreCase("Bob") is true
isPalIgnoreCase("DAD") is true
isPalIgnoreCase("Blob") is false

def isBetween(inVal:Int, min:Int, max:Int):Boolean = {
  inVal >= min && inVal <= max
}
  
def stripSpecial(inString:String):String = {
  var createdStr = ""
  for (c <- inString) {
    // convert to Int for comparison:
    val theValue = c.toInt
    if ( isBetween(theValue, 65, 122) ) {
      createdStr += c
    }
    else if ( isBetween(theValue, 48, 57) ) {
      createdStr += c
    }
  }
  return createdStr
}
def isPalIgnoreSpecial(inString:String):Boolean = {
  val basicString = stripSpecial(inString)
  isPalIgnoreCase(basicString)
}

/*(Hint: In integer values, ‘A’ is 65, ‘B’ is 66, ... ‘a’ is 97 ... ‘z’ is 122. ‘0’ is 48 ... ‘9’ is 57)*/
isPalIgnoreSpecial("Madam I'm adam") is true
isPalIgnoreSpecial("trees") is false
