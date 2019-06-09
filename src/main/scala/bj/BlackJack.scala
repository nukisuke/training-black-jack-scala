package bj

object BlackJack extends App with GameManager{
  val _deck = new CardList()
  println(_deck.toString())
}

