package Unit1_fundamentalsofjava.Methods;

public class passingArrayInMethods {
    public static void main(String[] args) {
        int[] x={21,43,67,8,34};
        int[] d= newMethod(x);
        d[2]=22;
        for (int i=0; i< x.length; i++){
            System.out.println("x[" + i +"] = " +x[i]);
        }

    }

    public static int[] newMethod(int[] c){
        c[3]=33;
        return c;
    }
}


