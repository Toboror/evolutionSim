public class Rabbit {

    public static boolean rabbitAlive = true;

    //Starting traits
    private static int reproduction;
    //Hunger level should range form 0 to 100.
    public static int hunger = 100;
    private static int age;

    //Ability to find food.
    //Range from 0 to 1?
    private static double findingFood = 1;

    public static int rabbitPop = 10;

    //Method for eating.
    //Returns new hunger level.
    public static void rabbitEating() {
        //Random num.
        double randomNum = Math.random();
        //If hLevel is below 30 the rabbit will go looking for food.
        if (hunger < 30) {
            findingFood = findingFood * randomNum;
            if (findingFood > 0.5) {
                hunger = hunger + 80;
            } else if (findingFood < 0.5) {
                rabbitPop = (int) (rabbitPop - 10*Math.random());
            }
        } else if (hunger >= 30) {
            hunger = hunger - 25;
        }
    }

    //Method for reproduction.
    public static void rabbitReproduction() {
        if (hunger > 70) {
            rabbitPop += (int) (rabbitPop + 100*(Math.random()));
            System.out.println("Rabbit pop is now " + rabbitPop);
            hunger = hunger - 20;
            double randomNum = Math.random();
            if (randomNum > 0.5) {
                findingFood = findingFood + 100*Math.random();
            }
        }
    }

    //Method for dying of age.

    //Method for gaining random mutation.

}
