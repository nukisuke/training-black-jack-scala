package bj;
class CardList(_deck: List[Card] = List[Card]() ) {
  val deck: List[Card] = shuffle()

  def shuffle(): List[Card] = {
    scala.util.Random.shuffle(makeDeck(List[Card]()))
  }

  private def makeDeck(de: List[Card], x: Int = 1): List[Card] = {
    if(x>13) return de  
    makeDeck( de ::: List(new Card(x,'H'),new Card(x,'C'),new Card(x,'D'),new Card(x,'S')) , x+1)
  }

  override def toString() = (deck.map( _.toString() )).mkString(",")
}
