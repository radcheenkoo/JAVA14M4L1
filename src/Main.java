import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        eleven();
        //ten();
        //nine();
        //seven();
        //six();
        //fifth();
        //third(60);
        //second();
        //first();

        int[] a = { getInt() };
    }

    public static int getInt() {
        return 8;
    }

    public static void eleven() {
        String[][] arr = {
                {"a", "b", "c"},
                {"d", "e", "f"},
                {"g", "h", "i"}
        };

        for (int i = 0; i < arr.length; i++) {
            //System.out.println(Arrays.toString(arr[i]));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + ", ");
        }
    }

    public static void ten() {
        Scanner scanner = new Scanner(System.in);

        String s;
        do {
            s = scanner.nextLine();
        } while (!s.equals("Exit"));


        scanner.close();
    }

    public static void nine() {
        Scanner scanner = new Scanner(System.in);

        boolean needToCont = true;
        while (needToCont) {
            String s = scanner.nextLine();

            if (s.equals("Exit")) {
                needToCont = false;
            }
        }

        int a = 10;
        int b = -5;

        while (b < a) {
            b++;
            a -= 2;
            System.out.println(b + "  b - a  " + a);
        }

        scanner.close();
    }

    public static void seven() {
        int[] arr = {8, 5, 9, 88, 73, 8, 9, 8};

        boolean needToContinue = arr.length != 0;
        int i = 0;
        while (needToContinue) {
            System.out.println(arr[i]);

            i++;
            if (i >= arr.length) {
                needToContinue = false;
            }
        }
    }

    public static void six() {
        int[] arr = {8, 5, 9, 88, 73, 8, 9, 8};
        //do not work
//        for (int i : arr) {
//            i = 0;
//        }

        //work
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 0;
//        }

        //do not work
//        for (int i = 0; i < arr.length; i++) {
//            int value = arr[i];
//            value = 0;
//        }

        for (int value : arr) {
            System.out.println(value);
        }
    }

    public static void fifth() {
        int[] arr = {8, 5, 9, 88, 73, 8, 9, 8};

        for (int i = 0; i < arr.length; i++) {
            int cellValue = arr[i];
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        for (int value : arr) {
            int cellValue = value;
            System.out.println("arr = " + value);
        }

        //count how many 8 in arr
        int count = 0;
        for (int value : arr) {
            System.out.println("arr[] = " + value);
            if (value == 8) {
                count++;
            }
        }
        System.out.println("we found " + count + " 8 in array");
    }

    public static void third(int iterateTo) {
        for (int i = 0; i < iterateTo; i++) {
            if (i <= 20) {
                continue;
            }
            if (i >= 100) {
                break;
            }
            if (i % 2 == 0) {
                System.out.println(i + " % 2 == 0 -> true");
            }
        }
        for (int i = 0; i < iterateTo; i++) {
            if (i > 20) {
                if (i >= 100) {
                    break;
                }
                if (i % 2 == 0) {
                    System.out.println(i + " % 2 == 0 -> true");
                }
            }
        }
        System.out.println();
    }

    public static void second() {
        for (int i = 0; i < 10; i += 2) {
            System.out.println("Hello world from for! " + i);
        }

        for (int i = 10; i > 0; i -= 2) {
            System.out.println("Hello world from for! " + i);
        }
    }

    public static void first() {
        // int i = 0 -> ініціалізація лічильника
        // i < 10 -> умова виконання циклу
        // i++ -> вираз що виконується пілся КОЖНОЇ ітерації циклу
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world from for! " + i);
        }

        int a = 0;
        a = a + 1;
        a += 1;
        a++;


        for (int i = 0; i < 10; System.out.println("I broke It")) {
            getIntArr();
            System.out.println("Hello world from for!" + i);
            i++;
        }

//        for(;;) {
//            System.out.println("Infinity LOOP");
//        }

        System.out.println("Row after for");
    }

    public static int[] getIntArr() {
        Scanner scanner1 = new Scanner("asdfsd");

        new String();

        String source = "asdfsd";
        Scanner scanner2 = new Scanner(source);

        return new int[5];
    }
}