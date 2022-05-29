package Unit1_fundamentalsofjava.Methods;

public class PassingAndReturningData {
//    public static void main(String[] args) {
//       int y;
//       y=add(10,20);
//       System.out.println(y);
//         OR
//        System.out.println(add(10,13));
//        System.out.println(add(33,88));
//        System.out.println(add(5,6) * add(5,5)); //
//        System.out.println(add(add(10,10), add(3,5)));// method calls can be used as arguments by using them in a method.
//    }
//    public static int add(int a, int b){
//        return a+b;
//    }
public static void main(String[] args) {

    //Volume Of Cone
    System.out.println(coneVolume(3,4));

}

public static double coneVolume(int r, int h){
    return Math.PI*r*r*h/3;  // Formula for cone & Math.PI is equal to 3.14
}
}
