package de.htwg.se.Malefiz

import de.htwg.se.Malefiz.model.{GameBoard, Player}
import java.io.File

import scala.io.Source


object Malefiz {

  val filePath = "/Users/robert/IdeaProjects/htwg-scala-seed/src/main/scala/de/htwg/se/Malefiz/model/mainCellConfiguration"
  val cellList = GameBoard().readFromFile(filePath)

  def main(args: Array[String]): Unit =  {

    cellList.foreach(x => println(x._1.toString))



  }
}
