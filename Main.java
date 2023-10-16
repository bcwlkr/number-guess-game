public class Main
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
    while (answer != randomNumber){
        if (answer < randomNumber){
            System.out.println("Too low. Guess again.");
            answer = scan.nextInt();
        }
        else if (answer > randomNumber){
            System.out.println("Too high. Guess again.");
            answer = scan.nextInt();
        }
    if (answer == randomNumber){
        System.out.println("You guessed correctly! The number was " + randomNumber);
    }
}
}
}
