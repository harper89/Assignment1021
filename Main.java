import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);
        System.out.print("How old are you? ");
        String age = scanner.nextLine();
        System.out.println("You are " + age + " years old.");
        
        scanner.close();
        System.out.print("hello");
    }
}
