import java.util.*;

public class Retirement
{
  public static void main(String[] arg)
    {
      //прочитать вводимые данные
      Scanner in = new Scanner(System.in);

      System.out.print("How much money do you need to retite? ");
      double goal = in.nextDouble();

      System.out.print("How much money will you contribute every year? ");
      double payment = in.nextDouble();

      System.out.print("Interest rate in %: ");
      double interestRate = in.nextDouble();

      double balance = 0;
      int years = 0;

      //обновить остаток на счету, пока не достигнута заданная сумма
      while (balance < goal)
      {
        //добавить ежегодный взнос и проценты
        balance += payment;
        double interest = balance * interestRate / 100;
        balance += interest;
        years++; 
      }

      System.out.println("You can retire in " + years + "years");
    }
}
