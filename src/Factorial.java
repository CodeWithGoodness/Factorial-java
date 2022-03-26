import java.util.Scanner;
import java.math.*;
public class Factorial {
    public static  void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        FactorialCalc numFactorial = new FactorialCalc(number);
        System.out.println("The factorial of " + number + "( i.e " + number +"!) is " + numFactorial.getFactorial());
    }
}
class FactorialCalc{
  private  int number;
    BigInteger multiple = new BigInteger("1") ;
    FactorialCalc (int newNumber){
        number = newNumber;
    }
   public BigInteger getFactorial(){
        for (int i = number; i >= 1; i--) {
         multiple = multiple.multiply( new BigInteger(i + ""));
        }return multiple;
    }
}

