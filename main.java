import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        String Path1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("You woke up in the middle of the Tam, you want to go back to Redwood");

        String input = scanner.nextLine().trim().toLowerCase();
        boolean choice = evaluateChoice(input);

        String result = choosePath1(choice);
        System.out.println(result);

        scanner.close();
    }

    public static boolean evaluateChoice(String input) {
        return input.equals("yes");
    }

    public static String choosePath1(boolean choice) {
      
        if (choice) {
            System.out.println("Hello");
        } 
        else {
           System.out.println("Bello");
        }return null;
    }
}