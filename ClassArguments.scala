import com.atomicscala.AtomicTest._

class Sum(args:Int*) {
  def result():Int = {
    var total = 0
    for(n <- args) {
      total += n
    }
    total
  }
}

new Sum(13, 27, 44).result() is 84
new Sum(1, 3, 5, 7, 9, 11).result() is 36

//Create a new class Family that takes a variable argument list
//representing the names of family members. Satisfy the following
//tests:

class Family(args:String*) {
  def familySize():Int = {
    args.size
  }
}

val family1 = new Family("Mom", "Dad", "Sally", "Dick")
family1.familySize() is 4
val family2 = new Family("Dad", "Mom", "Harry")
family2.familySize() is 3

//Create a new class Family that takes a variable argument list
//representing the names of family members. Satisfy the following
//tests:

class FlexibleFamily(mom:String, dad:String, kids:String*) {
  def familySize():Int = {
    2 + kids.size
  }
}

val family3 = new FlexibleFamily("Mom", "Dad", "Sally", "Dick")
family1.familySize() is 4
val family4 = new FlexibleFamily("Dad", "Mom", "Harry")
family2.familySize() is 3

val familyNoKids =
  new FlexibleFamily("Mom", "Dad")
familyNoKids.familySize() is 2

// This isn't allowed. Variable argument lists can only be at the end
//class UltraFlexibleFamily(parens:String*, kids:String*) {
//  def familySize():Int = {
//    2 + kids.size
//  }
//}

class Cup5(var percentFull:Int) {
  val max = 100

  def increase(pours: Int*):Int = {
    pours.foreach{ pour:Int =>
      percentFull += pour
      if(percentFull > max) 
        percentFull = max
    }
    percentFull // Return this value
  }
}

//val cup = new Cup5(0)
//cup.percentFull = 10
//cup.increase(50) is 60
//cup.increase(70) is 100

val cup5 = new Cup5(0)
cup5.increase(20, 30, 50, 20, 10, -10, -40, 10, 50) is 100

def squareThem(terms: Int*):Int = {
  var total = 0
  terms.foreach{ term:Int =>
    total += term*term
  }
  total
}

squareThem(2) is 4
squareThem(2, 4) is 20
squareThem(1, 2, 4) is 21
