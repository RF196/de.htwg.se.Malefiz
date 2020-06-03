package de.htwg.se.Malefiz.model

case class Cell(cellNumber: Int, playerNumber: Int, destination: Boolean, wallPermission: Boolean, hasWall: Boolean,
                coordinates: Point) {

  override def toString:String = "[ ]" + cellNumber

}

