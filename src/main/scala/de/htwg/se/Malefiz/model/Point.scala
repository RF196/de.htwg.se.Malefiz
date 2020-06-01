package de.htwg.se.Malefiz.model

case class Point(x: Int, y: Int) {

  override def toString: String = "x: " + this.x + " y: " + this.y

}