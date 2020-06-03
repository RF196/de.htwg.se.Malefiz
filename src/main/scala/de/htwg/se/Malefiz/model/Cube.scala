package de.htwg.se.Malefiz.model

case class Cube() {

  def getRandomNumber : Int = {
    val randomNumber = scala.util.Random.nextInt(6) + 1
    randomNumber
  }

}

