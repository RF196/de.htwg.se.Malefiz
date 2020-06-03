package de.htwg.se.Malefiz.model

import org.scalatest._
import org.scalatest.matchers.should.Matchers

import scala.io.Source

class GameBoardSpec extends WordSpec with Matchers {
  "A Gameboard is a graph with 116 Cells. For testing purpose we crated a new config testfile. The new testfile" when {
    "is created " should {
      val testSource = "de/htwg/se/Malefiz/model/testConfig.txt"
      val testCellList = GameBoard().getCellList(testSource)
      "have 10 Cells with different configurated attributes " in {
        testCellList.length should be (10)
      }
    }
  }

}
