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
      if ( response == "successful move" ) {
        if ( checkWinner(e) )
          response = "winner!"
      }

      printGrid
      response
    }

  def checkWinner(e:Char):Boolean = {
    var lDiagCnt = 0
    var rDiagCnt = 0
    var colCnts = Seq(0,0,0)
    var victory = false
    var diagIndex = 2

    for ( (row,rowIdx) <- cells.view.zipWithIndex ) {
      var rowCnt = 0
      for((cell,index) <- row.view.zipWithIndex) {
        if ( cell.entry == e ) {
          rowCnt+=1
          // This is needed to update the immutable counters
          colCnts = colCnts.view.zipWithIndex.map( { 
              case (cnt:Int, i:Int) => 
                if ( i == index ) { (cnt+1) } 
                else { (cnt) } 
            }).force 

          if ( index == rowIdx ) {
            lDiagCnt+=1
          }
          if ( index == (diagIndex - rowIdx) ) {
            rDiagCnt+=1
          }

          if ( rowCnt == 3 )
            victory = true
        }

      }
    }
    if ( colCnts.contains(3)  || rDiagCnt == 3 || lDiagCnt == 3)
      victory = true

    victory
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




