package Unit1_fundamentalsofjava.Methods;

public class ClassSlashStaticMembers {  // It's a class
    // int var=5;  It's a class variable that is global.
    // below are all the methods in a class. main(String[] args) is the main method called first and should always be present
    static int y=20;
    public static void main(String[] args) {

    methodTwo();
    methodOne();

    }
    public static void methodOne() {
        System.out.println(y);

    }

    public static void methodTwo(){
        System.out.println(y);

    }

}
