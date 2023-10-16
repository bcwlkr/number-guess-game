import java.util.Scanner;
import java.util.Random;

public class main
{
public static void main(String[] args) 
{
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    int randomNumber = random.nextInt(101); // Generates a random number between 0 and 100
    int answer = 0;
    System.out.println("Guess a number between 0 and 100");
    answer = scan.nextInt();
    while (answer < 0 || answer > 100){
        System.out.println("Invalid input. Please enter a number between 0 and 100.");
        answer = scan.nextInt();
    }
    if (answer == randomNumber){
    else{
        while (answer != randomNumber){
          if (answer < randomNumber){
            System.out.println("Too low! Try again.");
            answer = scan.nextInt();
      }
        else if (answer > randomNumber){
            System.out.println("Too high! Try again.");
            answer = scan.nextInt();
      }
    }
    }
}
    
} 
   // Ask the user to guess a number from 0 to 100 
   // Get the first guess using scan.nextInt();
 

   // Loop while the guess does not equal the random number,

     // If the guess is less than the random number, print out "Too low!"
   
     // If the guess is greater than the random number, print out "Too high!"
   
     // Get a new guess (save it into the same variable)
   

  // Print out something like "You got it!"


  }
}
