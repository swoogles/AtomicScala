import com.atomicscala.AtomicTest._
class Coffee(val shots:Int = 2,
  val decaf:Int = 0,
  val milk:Boolean = false,
  val toGo:Boolean = false,
  val syrup:String = "") 
{
  var result = ""
  val caf = shots - decaf
  println(shots, decaf, milk, toGo, syrup)
  def getCup():Unit = {
    if(toGo)
      result += "ToGoCup "
    else
      result += "HereCup "
  }
  def pourShots():Unit = {
    for(s <- 0 until shots)
      if ( s < decaf )
        result += "decaf shot "
      else
        result += "shot "
  }
  def addMilk():Unit = {
    if(milk)
      result += "milk "
  }
  def addSyrup():Unit = {
    result += syrup
  }

  getCup()
  pourShots()
  addMilk()
  addSyrup()
}

val usual = new Coffee
usual.result is "HereCup shot shot "
val mocha = new Coffee(decaf = 0,
  toGo = true, syrup = "Chocolate")
mocha.result is
"ToGoCup decaf shot decaf shot Chocolate"

val doubleHalfCaf =
  new Coffee(shots=2, decaf=1)
val tripleHalfCaf =
  new Coffee(shots=3, decaf=2)
doubleHalfCaf.decaf is 1
doubleHalfCaf.caf is 1
doubleHalfCaf.shots is 2
tripleHalfCaf.decaf is 2
tripleHalfCaf.caf is 1
tripleHalfCaf.shots is 3
