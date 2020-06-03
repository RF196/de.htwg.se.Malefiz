package de.htwg.se.Malefiz.model

import org.scalatest._
import org.scalatest.matchers.should.Matchers

import scala.io.Source

class GameBoardStringSpec extends WordSpec with Matchers {
  "The main idea is to use the graph structure to coordinate the Players within the List(of Cells) the list itself " +
    "is printed as the original Gameboard in a tree-like Structure" should {
      val testSource = "de/htwg/se/Malefiz/model/testConfig.txt"
      val testCellList = GameBoard().getCellList(testSource)
      "have 10 Cells with different configurated attributes " in {
        testCellList.length should be (10)
      }
    }


}
