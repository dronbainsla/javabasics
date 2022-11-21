package first_few_codes;

public class TypeCast {
    public static void main(String[] args) {
        // implicit type cast
        int numberOne=5;
        double numberTwo= numberOne;
        System.out.println(numberTwo);

        // explicit type cast
        double numberThree= 4.5;
        int numberFour= (int)numberThree;
        System.out.println(numberFour);

        //Division Type Cast
        int numberFive=6;
        int numberSix=4;

        System.out.println((double) (numberFive)/numberSix);

    }
}
