package Unit1_fundamentalsofjava.Methods;

public class PassingDataInMethods {
    public static void main(String[] args) {
        int var;
        var = 6;
        // newMethod(10);
        newMethod(var, 34.55, " Chocolate");
        // value passed in method parenthesis are called arguments

    }

    // variables declared in method parenthesis are called parameters
    public static void newMethod(int a, double b, String c) {
        System.out.println(a + b + c);// operator overloading as it adds numbers and concatenate the string

    }
}
