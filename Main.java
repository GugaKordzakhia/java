public class Main {
    public static void main(String[] args) {
        // 1 დავალება
        int a = 2;
        int b = 9;
        int c = 3;

        int D = b*b - (4 * a * c);

        System.out.println("დისკრიმინანტია: " + D);


        // 2 დავალება
        String[] cars = {"mercedes", "bmw", "porsche", "lamborghini", };
        String mainCar = cars[0];
        for (String car : cars) {
            if (mainCar.length() > car.length()) {
                mainCar = car;
            }
        }
        System.out.println(mainCar);


        // 3 დავალება
        Fraction f1 = new Fraction();

        f1.numerator = 6;
        f1.denominator = 9;

        Fraction f2 = new Fraction();

        f2.numerator = 8;
        f2.denominator = 10;

        // შეკვეცა
        int newNumerator1 = f1.numerator / 3;
        int newDenominator1 = f1.denominator / 3;
        int newNumerator2 = f2.numerator / 2;
        int newDenominator2 = f2.denominator / 2;

        System.out.println("შეკვეცილი პირველი წილადი: " + newNumerator1 + " / " + newDenominator1);
        System.out.println("შეკვეცილი მეორე წილადი: " + newNumerator2 + " / " + newDenominator2);


        // გამრავლება
        int multiplyNumerator = newNumerator1 * newNumerator2;
        int multiplyDenominator = newDenominator1 * newDenominator2;

        System.out.println("გამრავლებული წილადი: " + multiplyNumerator + " / " + multiplyDenominator);


        // მიმატება
        int plusNumerator = newNumerator1 * newDenominator2 + newNumerator2 * newDenominator1;
        int plusDenominator = newDenominator1 * newDenominator2;

        System.out.println("მიმატებული წილადი: " + plusNumerator + " / " + plusDenominator);


    }
}


