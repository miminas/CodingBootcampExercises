import java.util.Scanner;
public class Exercise2 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in); //To kaloume gia na eisagoume dedomena
      System.out.print("Enter number of 50 euro banknotes: "); //Zitaei arithmo apo ton christi
      int euro50 = scanner.nextInt(); // Eisagei ton arithmo sti metavliti
      System.out.print("Enter number of 20 euro banknotes: "); //Zitaei arithmo apo ton christi
      int euro20 = scanner.nextInt(); // Eisagei ton arithmo sti metavliti
      System.out.print("Enter number of 10 euro banknotes: "); //Zitaei arithmo apo ton christi
      int euro10 = scanner.nextInt(); // Eisagei ton arithmo sti metavliti
      System.out.print("Enter number of 5 euro banknotes: "); //Zitaei arithmo apo ton christi
      int euro5 = scanner.nextInt(); // Eisagei ton arithmo sti metavliti
      int sum = euro50*50 + euro20*20 + euro10*10 + euro5*5;
      System.out.println("You have " + sum + " euros."); // Typonei to synolo
    }
}
