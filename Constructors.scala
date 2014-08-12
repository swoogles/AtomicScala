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

//2. Create a new class Tea that has 2 methods: describe, which includes information about whether the tea includes milk, sugar, is decaffeinated, and includes the name; and calories, which adds
//100 calories for milk and 16 calories for sugar. Satisfy the following tests:

class Tea(
  val milk:Boolean = false,
  val sugar:Boolean = false,
  val decaf:Boolean = false,
  val name:String = "Earl Grey"
)
{
  def calories():Int = {
    var calories = 0
    if ( milk )
      calories += 100
    if ( sugar )
      calories += 16
    calories
  }

  def describe():String = {
    var description = name
    if (decaf)
      description += " decaf"
    if (sugar)
      description += " + sugar"
    if (milk)
      description += " + milk"
    description
  }
}



val tea = new Tea
tea.describe is "Earl Grey"
tea.calories is 0
val lemonZinger = new Tea(
  decaf = true, name="Lemon Zinger")
lemonZinger.describe is
"Lemon Zinger decaf"
lemonZinger.calories is 0
val sweetGreen = new Tea(
  name="Jasmine Green", sugar=true)
sweetGreen.describe is
"Jasmine Green + sugar"
sweetGreen.calories is 16
