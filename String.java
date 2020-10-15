import java.util.Scanner;

public class EvenInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lower limit");
        int low = scanner.nextInt();
        System.out.println("Enter last limit");
        int max = scanner.nextInt();

        for (int i = low; i <= max; i++)
        {
            if(i%2 == 0)
            {
                System.out.println(i);
            }
        }
    }
}
