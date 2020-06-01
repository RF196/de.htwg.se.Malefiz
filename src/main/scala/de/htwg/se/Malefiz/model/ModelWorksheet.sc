
import scala.io.Source


  val source = Source.fromFile("/Users/robert/IdeaProjects/htwg-scala-seed/src/main/scala/de/htwg/se/Malefiz/model/mainCellLinks")
  val lines = source.getLines()


  while (lines.hasNext) {
    val x = lines.next()
    val test : Array[String] = x.split(" ")
    val a = test(0)
    val b = test(1)
    print("A:" + a + " B: " + b)
    println()
  }

  source.close()
