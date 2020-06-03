package de.htwg.se.Malefiz.model
import scala.collection.immutable.HashMap
import scala.collection.mutable.Map
import scala.util.Using
import scala.io.Source
import scala.io.Source

case class GameBoard() {

  def getCellList(filename: String): List[Cell] = {
    val list = Source.fromFile(filename)
    val inputData =  list.getLines
      .map(line => line.split(" "))
      .map{case Array(cellNumber, playerNumber, destination, wallPermission, hasWall, x, y) =>
        Cell(cellNumber.toInt,
          playerNumber.toInt,
          destination.toBoolean,
          wallPermission.toBoolean,
          hasWall.toBoolean,
          Point(x.toInt, y.toInt))}
      .toList
    list.close()
    inputData
  }

  def getCellGraph(in: String) : Map[Int, Set[Int]] = {
    val source =Source.fromFile(in)
    val lines = source.getLines()
    val graph : Map[Int, Set[Int]] = Map.empty
    while (lines.hasNext) {
      val input = lines.next()
      val inputArray: Array[String] = input.split(" ")
      for (i <- 1 until inputArray.length) {
        updateCellGraph(inputArray(0).toInt, inputArray(i).toInt, graph)
      }
    }
    graph
  }

  def updateCellGraph(key: Int, value: Int, map: Map[Int, Set[Int]]) : Map[Int, Set[Int]] = {
    map.get(key)
      .map(_=> map(key) += value)
      .getOrElse(map(key) = Set[Int](value))
    map
  }
}
