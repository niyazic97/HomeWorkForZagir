package ru.itpark.part2;

import java.util.Scanner;

public class ShowInRage {
public void LearnEvenNumbers(){
    System.out.println("Введите любые числа,пожалуйста");
    Scanner ShowInRage = new Scanner(System.in);
    int min = ShowInRage.nextInt();
    int max = ShowInRage.nextInt();

    for (int i = min; i <max+1; i++) {
        if (i%2 ==0){
            System.out.println("Ваше число "+i);
        }
    }
    }
}

