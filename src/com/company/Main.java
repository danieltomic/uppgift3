package com.company;
import java.util.Collections;
import java.util.Scanner;

public class Main {
  //  private static final int MAX = 5;

    public static void main(String[] args) {
        int counter = 1;
        double[] tal = new double[5];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.println("Vänligen mata in värdet för tal " + (tal[i] + counter++));
            tal[i] = scanner.nextDouble();
        }

        double största = tal[0];
        for (int i = 0; i < tal.length; i++) {
            if (största < tal[i]) {
                största = tal[i];
            }
        }

        double summa = getSumma(tal);
        double medelvärde = getMedelvärde(tal);

        System.out.println("Medelvärdet av dina fem tal är: " + medelvärde);
        System.out.println("Summan av dina fem tal är: " + summa);
        System.out.println("Det största av dina fem tal är: " + största);
    }

    public static double getSumma(double[] tal){
        double sum = 0;
        for (double värde : tal){
            sum += värde;
        }
        return sum;
    }

    public static double getMedelvärde(double[] tal){
        double sum = getSumma(tal);
        return sum / 5;
    }
}
