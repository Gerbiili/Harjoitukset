import java.util.Random;
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
        for (int counter = 0 ; counter < 100 ; counter++) {
            System.out.println(r.nextInt(6)+1);
        }
    }
}
