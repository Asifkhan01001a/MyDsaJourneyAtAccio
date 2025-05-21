package MyDsaJourneyAtAccio.BasicProblems;

import java.util.Scanner;

public class CeltoFer {
    public static void main(String[] args) {
        //Write your code here
        Scanner scanner = new Scanner(System.in);
        int tempInCelsius = scanner.nextInt();

        int tempInFahrenheit = (tempInCelsius * 9 / 5) + 32;

        System.out.println(tempInFahrenheit);

        scanner.close();

    }
}
