import java.util.Scanner;

public class EvenInRange {
public class OddInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lower limit");
@@ -10,7 +10,7 @@ public static void main(String[] args) {

        for (int i = low; i <= max; i++)
        {
            if(i%2 == 0)
            if(i%2 != 0)
            {
                System.out.println(i);
            }
        }
    }
}
