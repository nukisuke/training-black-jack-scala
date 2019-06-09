package bj

trait GameManager{
  val deck: Seq[Card];

  def makeDeck(): Seq[Card] = {
    Seq(new Card(12,'H'),new Card(13,'D'))
  }
  
}