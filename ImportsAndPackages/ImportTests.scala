// ImportRoyalty.scala
import com.billdingstuff.royals.{Crest,Royalty}
val royal = new Royalty("Henry", "Laughs")
val title = royal.title()
assert("Sir Laughsalot" == title, "Expected Sir Laughsalot, Got " + title)

val crest = new Crest("Bear", 1875)
println(crest.description())
