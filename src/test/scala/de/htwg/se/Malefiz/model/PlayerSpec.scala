package test.scala.de.htwg.se.Malefiz.model

import de.htwg.se.Malefiz.model.Player
import org.scalatest._
import org.scalatest.matchers.should.Matchers

class PlayerSpec extends WordSpec with Matchers {
  "A Player" when { "new" should {
    val player = Player("Your Name")
    "have a name"  in {
      player.name should be("Your Name")
    }
    "have a nice String representation" in {
      player.toString should be("Your Name")
    }
  }}


}
