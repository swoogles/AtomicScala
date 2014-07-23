// Temperature.scala
package com.atomicscala

class Temperature {
  var current = 0.0
  var scale = "f"
  def setFahrenheit(now:Double):Unit = {
    current = now
    scale = "f"
  }
  def setCelsius(now:Double):Unit = {
    current = now
    scale = "c"
  }
  def setKelvin(now:Double):Unit = {
    current = now
    scale = "k"
  }

  def getFahrenheit():Double = {
    if(scale == "f")
      current
    else if (scale == "c")
      current * 9.0/5.0 + 32.0
    else
      (current - 273.15) * 9.0/5.0 + 32.0
  }
  def getCelsius():Double = {
    if(scale == "c")
      current
    else if (scale == "f")
      (current - 32.0) * 5.0/9.0
    else
      current + 273.15
  }
  def getKelvin():Double = {
    if(scale == "k")
      current
    else {
      getCelsius() + 273.15
    }
  }
}
