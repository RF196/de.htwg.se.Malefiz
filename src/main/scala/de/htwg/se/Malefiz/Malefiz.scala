package de.htwg.se.Malefiz

import de.htwg.se.Malefiz.model.{GameBoard, Player}


object Malefiz {

  val filePathMainConfig = "/Users/robert/IdeaProjects/htwg-scala-seed/src/main/scala/de/htwg/se/Malefiz/model/mainCellConfiguration"
  val filePathLinksConfig = "/Users/robert/IdeaProjects/htwg-scala-seed/src/main/scala/de/htwg/se/Malefiz/model/mainCellLinks"

  val cellList = GameBoard().getCellList(filePathMainConfig)

  def main(args: Array[String]): Unit =  {


    val cellLinks = GameBoard().getCellGraph(filePathLinksConfig)

    println(cellLinks.size)
    println(cellList.length)

    /*
    for (i <- graph) {
      println(i._1)
    }

    println(graph.size)


    graph.foreach(x => println(x.toString()))

  */
  }
}
