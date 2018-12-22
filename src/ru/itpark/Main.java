package ru.itpark;

import ru.itpark.part1.SumOfNumbers;
import ru.itpark.part2.ShowInRage;

public class Main {
    public static void main(String[] args) {
        SumOfNumbers sumOfNumbers = new SumOfNumbers();
        sumOfNumbers.CalculateSum();
        ShowInRage showInRage = new ShowInRage();
        showInRage.LearnEvenNumbers();

    }
}
