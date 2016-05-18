import java.io._

class Point(val xc: Int,  val yc: Int) {
  var x: Int = xc
  var y: Int = yc
  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
  }
}

object singleLyn {
  var thing1 = 3
  var thing2 = 2.0

  def manip(x: Double, y: Int) {
    thing1 = y
    thing2 = x
  }

}

object Demo {
  def main(args: Array[String]) {
    val point = new Point(10, 20)
    println("singleton 1: " + singleLyn.thing1);
    println("singleton 2: " + singleLyn.thing2);

    modSingleton
    println("\tAnd after manipulating it");

    println("singleton 1: " + singleLyn.thing1);
    println("singleton 2: " + singleLyn.thing2);

    printPoint

    def modSingleton {
      singleLyn.manip(3.1415, 255)
    }

    def printPoint {
      println("point x loc: " + point.x);
      println("point y loc: " + point.y);
    }
  }
}
