import java.util.Scanner;

public class DietAdvice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("|-----------------------------------------------------|");
        System.out.println("|              * DOCTOR'S DIET ADVISOR *              |");
        System.out.println("|-----------------------------------------------------|");

        System.out.print("| Enter the number of calories in the food -> ");
        double calories = input.nextDouble();

        System.out.println("|-----------------------------------------------------|");

        System.out.print("| Enter the number of fat grams in the food -> ");
        double fatGrams = input.nextDouble();

        System.out.println("|-----------------------------------------------------|");

        double fatCalories = fatGrams * 5; // One gram of fat has 5 calories
        double percentage = (fatCalories / calories) * 100;

        System.out.printf("| Percentage of calories that come from fat -> %.2f%%\n", percentage);

        if (percentage < 30) {
            System.out.println("| This food is low in fat !!");
        }
        System.out.println("|-----------------------------------------------------|");
    }
}
