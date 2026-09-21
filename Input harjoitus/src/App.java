import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    //     for (int counter = 0 ; counter < 5 ; counter++)
    // {
    //     System.out.println(counter+1);
    // }

    // While
    // int counter = 0;
    // while (counter < 5) {
    //     System.out.println(counter+1);
    //     counter++;
    // }

    //Do while

        Random r = new Random();
        Scanner in = new Scanner(System.in);
        String playAgain;

        do {
            System.out.println("Throwing a dice.");
            System.out.println(r.nextInt(6)+1);
            System.out.println("Again? (Y/N)");
            playAgain = in.nextLine();
        } while (playAgain.equalsIgnoreCase ("y"));

        System .out.println("Thanks for playing!");
    }
}
