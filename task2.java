import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
    
       try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("What is your name? ");
           String name = scanner.nextLine();
           System.out.println();

           System.out.println("What is your age? ");
           String age = scanner.nextLine();
           System.out.println();

           System.out.println("Do you clap your hands? ");
           String dont = scanner.nextLine();
           // Ved ikke hvordan jeg laver en boolean her, da det allerede er i en class for sig selv i main
           System.out.println();

           System.out.print("My name is " + name + ",and I am " + age + " years old, and i " + dont + " clap my hands");
    }
    }
}