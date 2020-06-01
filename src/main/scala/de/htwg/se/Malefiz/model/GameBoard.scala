package de.htwg.se.Malefiz.model

import scala.collection.SortedMap
import scala.io.Source

case class GameBoard(playGround: Map[Cell, Set[Cell]]) {

  val graph = GameBoard(Nil -> Set(Nil))

  def readFromFile(path: String) : Map[Cell, Set[Cell]] = {
    val configurationSource = Source.fromFile(path)
    val lines = configurationSource.getLines()

    while (lines.hasNext) {
      val input = lines.next()
      val inputArray: Array[String] = input.split(" ")
      val cellNumber = inputArray(0).toInt
      val playerNumber = inputArray(1).toInt
      val destination = inputArray(2).toBoolean
      val wallPermission = inputArray(3).toBoolean
      val wallSet = inputArray(4).toBoolean
      val xCoordinate = inputArray(5).toInt
      val yCoordinate = inputArray(6).toInt
      val inputCell = Cell(cellNumber, playerNumber, destination, wallPermission, wallSet, Point(xCoordinate, yCoordinate))
      addCell(inputCell)
    }
    graph
  }
    def addCell(cell: Cell): Boolean = {
      graph :+ (cell -> Set())
      true

    }

    def containsCell(cell: Cell): Boolean = {
      if (!graph.contains(cell)) {
        false
      }
      true
    }

}
/*
  def generateListOfCells(path: String): List[Cell] = {
    val configurationSource = Source.fromFile(path)
    val lines = configurationSource.getLines()
    val cellList: Vector[Cell] = {

    }
    while (lines.hasNext) {
      val input = lines.next()
      val inputArray: Array[String] = input.split(" ")
      val cellNumber = inputArray(0).toInt
      val playerNumber = inputArray(1).toInt
      val destination = inputArray(2).toBoolean
      val wallPermission = inputArray(3).toBoolean
      val wallSet = inputArray(4).toBoolean
      val xCoordinate = inputArray(5).toInt
      val yCoordinate = inputArray(6).toInt
      cellList  Cell(cellNumber, playerNumber, destination, wallPermission, wallSet, Point(xCoordinate, yCoordinate))
    }
    cellList
  }
}

 */

  /*
  def generateGameBoardGraph(graphList: List[Cell], path: String) : SortedMap[Cell, Set[Cell]] = {
    val configurationSource = Source.fromFile(path)
    val lines = configurationSource.getLines()

    val gameBoardGraph: SortedMap[Cell, Set[Cell]] = {

      while(lines.hasNext) {
        val input = lines.next
        val inputArray : Array[String] = input.split(" ")
        val num1 = inputArray(0).toInt
        val num2 = inputArray(1).toInt

        gameBoardGraph :+ graphList(num1) -> Set(graphList(num2))

      }


    }




  }


  val source = Source.fromFile("mainCellConfiguration.txt")
  val lines = source.getLines()

  while(lines.hasNext) {
    val test = lines.map(lines => lines.split(" ")).toArray
  }


}
*/