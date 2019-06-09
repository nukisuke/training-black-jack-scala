package bj;
class Card(val number: Int, val mark: Char){
  mark match {
    case 'H' => 
    case 'C' => 
    case 'D' => 
    case 'S' => 
  }

  class Contains(r: Range) { def unapply(i: Int): Boolean = r contains i }
  final val range = new Contains(1 to 13)
  number match {
    case range() => 
  }

  def display(nubmer: Int): String = number match {
      case 11 => "J"
      case 12 => "Q"
      case 13 => "K"
      case _ => number.toString()
  }
  override def toString() = {"" + mark + display(number)};
}
