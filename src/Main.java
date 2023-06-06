import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
//        Scanner scan = new Scanner(System.in);

//        int number = convertStrToInt("2a");
//        fillArraySameChars("g",0);
//        divisionByZero("0");
//        String[][] vasya = new String[][]{{"4","7","8","9","4","8"}, {"4","7","8","9","4","8"}};
//        String a = sum2d(vasya);
//        System.out.println(a);
          int[] arr1 = new int[]{2,6,9,13,4};
          int[] arr2 = new int[]{2,8,2,3};
            for (int i: substractionOfArraysElements(arr1,arr2)
             ) {
            System.out.println(i);
          }
    }
    public static int convertStrToInt(String num){
        try {
            return Integer.parseInt(num);
        }
        catch (Exception e) {
            throw new NumberFormatException("введите число корректно");
        }
    }
    public static void fillArraySameChars(String someStr, int arrSize)
    {
        char[] chars = new char[arrSize];
        if(arrSize < 1){
            throw new ArrayIndexOutOfBoundsException("длина массива не может быть меньше 1");
        }
        for (int i = 0; i < chars.length; i++) {
            chars[i] = someStr.charAt(0);
            System.out.print(chars[i]);
        }
    }
    public static void divisionByZero(String someStr) {
        int a = Integer.parseInt(someStr);
        int bb = 10 / a;
    }

    //2. Задание: Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
    //NumberFormatException, ArrayIndexOutOfBoundsException

    /* 3 задание. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
    Если длины массивов не равны, необходимо как-то оповестить пользователя. */
    public static int[] substractionOfArraysElements (int[] arr1, int[] arr2){

        if (arr1.length != arr2.length){
            throw new RuntimeException ("длины массивов разные");
        }
        int[] substractarr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            substractarr[i] = arr1[i] - arr2[i];
        }
        return substractarr;
    }
}
