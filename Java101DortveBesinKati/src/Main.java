import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int c;
        List<Integer> multiplesOfFour = new ArrayList<>();
        List<Integer> multiplesOfFive = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        c = input.nextInt();


        for (int i = 1, j = 1; i <= c || j <= c; i *= 4, j *= 5) {

            if (i != 1 && j != 1) {
                if (i <= c && j <= c) {
                    multiplesOfFour.add(i);
                    multiplesOfFive.add(j);
                } else if (i <= c) {
                    multiplesOfFour.add(i);
                } else if (j <= c) {
                    multiplesOfFive.add(j);
                }
            }
        }

        System.out.println(c + " Dahil olmak üzere bu değere kadar, dördün kuvvetleri :" + multiplesOfFour);
        System.out.println(c + " Dahil olmak üzere bu değere kadar, beşin kuvvetleri :" + multiplesOfFive);
        input.close();
    }
}