// TheRoyalty.scala
package com.billdingstuff.royals
class Royalty(name:String, characteristic:String) {
  def title():String = {
  "Sir " + characteristic + "alot"
}
  def fancyTitle():String = {
    "Sir " + name +
  " " + characteristic + "alot"
  }
}

class Crest(name:String, year:Int) {
  def description():String = {
    name + " in the year " + year + ","
  }
}
