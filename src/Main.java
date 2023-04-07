import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (Rabbit.rabbitAlive) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Press 1 to pass time once!");

                String input1 = scanner.nextLine();

                if (input1.equals("1")) {
                    System.out.println("You passed the time once!");
                    System.out.println("Rabbit pop is " + Rabbit.rabbitPop);
                    Rabbit.rabbitEating();
                    Rabbit.rabbitReproduction();
                    if (Rabbit.rabbitPop<=0) {
                        Rabbit.rabbitAlive = false;
                    }
                }
            }
        }

    }
