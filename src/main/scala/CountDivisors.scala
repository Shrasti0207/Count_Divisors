import scala.io.StdIn
import scala.util.Try

object CountDivisors {
  def main(args:Array[String]): Unit = {
    println("Enter value for inputA :")
    val inputA = StdIn.readInt()

    println("Enter value for inputB :")
    val inputB = StdIn.readInt()

    println("Enter value for inputC :")
    val inputC = StdIn.readInt()

    var counter=0

    try {
      for (index <- inputA to inputB) {
        if (index % inputC == 0)
          counter = counter + 1
      }
    }
    catch{
        case _: Exception=> throw new Exception("Invalid input values")
    }
    println("The value of count divisors : "+counter)

    }
  }
