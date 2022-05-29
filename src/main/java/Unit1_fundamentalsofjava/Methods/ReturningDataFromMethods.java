package Unit1_fundamentalsofjava.Methods;

public class ReturningDataFromMethods {
    public static void main(String[] args) {
        methodOne(3);
//        int var = methodTwo();
//        System.out.println(var);
        //   OR
        System.out.println(methodTwo());

    }
    public static void methodOne(int a){
        if(a<4){
            return;
        }
        System.out.println(a);
    }

    public static int methodTwo(){
        return 40;
    }
}
