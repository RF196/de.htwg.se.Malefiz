package de.htwg.se.Malefiz

import de.htwg.se.Malefiz.model.Player

object Malefiz {
  def main(args: Array[String]): Unit = {
    val student = Player("Your Name")
    println("Hello, " + student.name)
  }
}
