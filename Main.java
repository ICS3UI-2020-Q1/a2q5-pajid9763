import java.util.Scanner;
/**
 * program for the game "FizzBuzz"
 * @author Darian Pajic
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // ask the user for a number 
  System.out.println("Please enter a number to play FizzBuzz");
  int num = input.nextInt();

  // figure out what they have to say
  if (num % 3 == 0 && num % 5 == 0){
    System.out.println("You should say FizzBuzz");
  }else if (num % 3 == 0){
    System.out.println("You should say Fizz");
  }else if (num % 5 == 0){
    System.out.println("You should say Buzz");
  }else{
    System.out.println("You should say " + num);
  }
    
  }
}
