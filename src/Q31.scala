object Q31 {
  def main(args: Array[String]): Unit = {
  println(prime(5,2))
  }

  def prime(n:Int, i:Int):Boolean = {

    if (n <= 2)
      1
    if (n % i == 0)
      0
    if (i * i > n)
      1
    prime(n, i + 1)

  }




}
