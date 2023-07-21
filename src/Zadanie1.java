public class Zadanie1 {
    public static void main(String[] args) {
        // zadeklaruj i zainicjalizuj 4 randomowe (z klawiatury) zmienne typu int
        int firstVariable = 47;
        int secondVariable = 387;
        int thirdVariable = 25;
        int fourthVariable = 3896367;
        System.out.println("Numbers:");
        System.out.println(firstVariable);
        System.out.println(secondVariable);
        System.out.println(thirdVariable);
        System.out.println(fourthVariable);

        // sprwdz czy suma 2 pierwszych jest parzysta
        int firstSum = firstVariable + secondVariable;
        boolean firstSumIsEven;
        if (firstSum % 2 == 0) {
            firstSumIsEven = true;
        } else {
            firstSumIsEven = false;
        }
        System.out.println("First sum: " + firstSum);
        System.out.println("First sum is even: " + firstSumIsEven);

        // sprawdz czy suma 2 pozostałych jest parzysta
        int secondSum = thirdVariable + fourthVariable;
        boolean secondSumIsEven;
        if (secondSum % 2 == 0) {
            secondSumIsEven = true;
        } else {
            secondSumIsEven = false;
        }
        System.out.println("Second sum: " + secondSum);
        System.out.println("Second sum is even: " + secondSumIsEven);

        // sprawdz czy obie sumy sum sa parzyste i wyswietl odpwoednia informacje
        if (firstSumIsEven && secondSumIsEven) {
            System.out.println("All sums are even but it does not necessary means that all numbers are even ;)");
        } else {
            System.out.println("Not all sums are even");
        }
    }
}
