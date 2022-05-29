package Unit1_fundamentalsofjava.arrayWithCoding;

public class ArrayFirstProgram {
    public static void main(String[] args) {
        //Create an integer array of 10 elements and give each element an arbitrary value. Print out the entire array using a loop.

        int[] arrOfIntegers= new int[10];
        arrOfIntegers[0]=10;
        arrOfIntegers[1]=20;
        arrOfIntegers[2]=30;
        arrOfIntegers[3]=40;
        arrOfIntegers[4]=50;
        arrOfIntegers[5]=60;
        arrOfIntegers[6]=70;
        arrOfIntegers[7]=80;
        arrOfIntegers[8]=90;
        arrOfIntegers[9]=100;

//        for (int e:arrOfIntegers){
//            System.out.println(e);
//        }       OR
        for (int i=0; i<arrOfIntegers.length; i++){
            System.out.println(arrOfIntegers[i]);
        }

    }
}
