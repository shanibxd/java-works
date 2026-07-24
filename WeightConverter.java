import java.util.Scanner;

public class WeightConverter{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;
        System.out.println("Weigtht converting program :\n\n");


        System.out.println("1. Convert lbs to kg ");
        System.out.println("2. Convert kg to lbs ");
        System.out.print("Select Any One Option :");
        choice = scanner.nextInt();

        if(choice == 1)
        {
            System.out.print("Enter the lbs :");
            weight = scanner.nextDouble();
            System.out.printf("After converting to kg is %.2f kg ", weight * 0.453592 );
        }
         else if (choice == 2) {

            System.out.print("Enter the kg :");
            weight = scanner.nextDouble();
            System.out.printf("After converting to lbs is %.2f lbs ", weight * 2.20462 );
        }
         else {
            System.out.println("Only choose 1/2 ");
        }
    }
}
