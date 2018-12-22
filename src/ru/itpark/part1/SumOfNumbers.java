package ru.itpark.part1;

import java.util.Scanner;

public class SumOfNumbers {
    public void CalculateSum(){
        System.out.println("Введите любые два числа,пожалуйста");
        Scanner ShowInRage = new Scanner(System.in);
        int number1 = ShowInRage.nextInt();
        int number2 = ShowInRage.nextInt();
        int sum = number1+number2;
        System.out.println("Сума двух чисел равна "+sum);
    }
}
