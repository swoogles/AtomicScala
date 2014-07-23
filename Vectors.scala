import com.atomicscala.AtomicTest._
val v1 = Vector[Vector[Int]](Vector[Int](1,2,3), Vector[Int](4,5,6), Vector[Int](7,8,9))

val v2 = Vector[String] ("The", "dog", "visited", "the", "firehouse" )

for ( word <- v2 ) {
  println(word)
}

var sentence = ""
  for (word <- v2 ) {
    sentence += word + " "
  }

println(sentence.replace("firehouse ", "firehouse!") )

for ( word <- v2 ) {
  println(word.reverse + " ")
}

for ( word <- v2.reverse ) {
  println(word)
}

var v3:Vector[Int] = Vector(0, 1, 2, 3, 4, 5)
var v4:Vector[Float] = Vector(0, 1, 2, 3, 4, 5)

println(v3.sum)
println(v3.min)
println(v3.max)

println(v4.sum)
println(v4.min)
println(v4.max)


println(v2.min)
println(v2.max)

val sum = Range(0,10).sum
println(sum)

val myList = List("Hi", "I'm", "a", "list")
val mySet = Set("Hi", "I'm", "a", "set")

println(myList)
println(mySet)

for ( listItem <- myList ) {
  print(listItem + " " )
}

for ( setItem <- mySet ) {
  print(setItem + " " )
}

println("Reverse list: " + myList.reverse)
/*println("Reverse set: " + mySet.reverse)*/

println("Sorted list: " + myList.sorted)
/*println("Sorted set: " + mySet.sorted)*/

// Reverse and sorted do not work on sets, since they are not ordered

val myVector1 = Vector(1,2,3,4,5,6)
val myVector2 = Vector(1,2,3,4,5,6)

myVector1 is myVector2

// myVector1 and myVector2 are equivalent, which is slightly surprising, since I thought they might be doing address comparisons, but apparently they do value comparisons, and are rightly shown to be equal
