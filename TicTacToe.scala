package com.atomicscala

class Cell {
  var entry = ' '
  def set(e:Char):String = {
    if(entry==' ' && (e=='X' || e=='O')) {
      entry = e
      "successful move"
    } else
      "invalid move"
    }
}
class Grid {
  val cells = Vector(
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell)
  )
  def play(e:Char, x:Int, y:Int):String = {
    var response:String = ""
    if(x < 0 || x > 2 || y < 0 || y > 2)
      response = "invalid move"
    else
      response = cells(x)(y).set(e)

      printGrid
      response
    }
  def printGrid():Unit = {
    println("____")
    for ( row <- cells ) {
      print('|')
      for ( cell <- row ) {
        print(cell.entry)
      }
      println('|')
    }
    println("____")
  }
}




