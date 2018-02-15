val v = Vector(1,2,3,7)
v(3)

var l : Stream[(Int, String)] = Stream.empty
val g = (1, "l")
l = Stream.cons(g, List(g).toStream)


val p = 8 :: l

val s = Stream(1)
val z = s #::: Stream(9)
s.toList
z.toList

val pd = s append Stream(9)
pd






















