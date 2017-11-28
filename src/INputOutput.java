import java.util.*;

public class INputOutput
{
  public static void main (String[] arg) 
  {
    Scanner in = new Scanner(System.in);

  
    // получить первую вводимую строку
    System.out.print("What is your name? ");
    String name = in.nextLine();

    // получить вторую вводимую строку      
    System.out.print("How old are you? ");
    int age = in.nextInt();

    System.out.println("Hello %s, " + name + ". Next year, you'll be %d" + (age + 1) +", so young");
  }
}
