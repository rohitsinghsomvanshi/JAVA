import java.util.Scanner;
public class Table {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 10 && num <= 20) {

            for (int i = 1; i <= 10; i++) {
                System.out.println(num +  "x" +"" +  i  + "=" + (num * i));
            }

        } else {
            System.out.println("Enter a Number Between 10 and 20");
        }

        sc.close();
    }
}