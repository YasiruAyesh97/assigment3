object Q345 {

  def main(args: Array[String]): Unit = {
    println(isEven(5))
    println(isOdd(5))
    println(evenSum(10))
  }


  def isEven(n:Int):Boolean= n match{

    case 0 => true
    case _ => isOdd(n-1)
  }
  def isOdd(n:Int):Boolean = !(isEven(n))

  def evenSum(n:Int):Int={
    if(n==0) 0
    else if(isEven(n)) n+evenSum(n-2) else (n-1) + evenSum(n-3)
  }


}