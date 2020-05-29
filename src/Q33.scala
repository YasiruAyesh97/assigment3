object Q33 {
  def main(args: Array[String]): Unit = {
    println(sum(5))
  }


  def sum(n:Int) :Int ={
    if(n==0){
      return 0;
    }

  return n + sum(n-1)
  }
}
