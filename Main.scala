package example

object Main {
  def main(args: Array[String]): Unit = {
    println(Array(-2147483648).map(_ % -1))
  }
}
