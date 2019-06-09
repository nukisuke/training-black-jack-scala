package bj

object BlackJack extends App with GameManager{
  val c = new Card(13, 'D')
  println(makeDeck().toString())
  
}

