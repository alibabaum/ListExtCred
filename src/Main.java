
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> listOfStrings = new ArrayList<String>();

    }

    public static void arrayReversal() {
        int i = 0;
        Scanner inScanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.println("Enter values (-1 to stop)");
        int scan = inScanner.nextInt();

        while (scan >= 0) {
            numbers.add(scan);
            i++;
            scan = inScanner.nextInt();
        }

        System.out.println("Your values reversed:");

        i = i - 1;

        while (i >= 0) {
            System.out.println(numbers.get(i));
            i--;
        }
    }

    public static List<Character> stringToArray(String something) {
        ArrayList<Character> chars = new ArrayList<>();
        for (char ch : something.toCharArray()) {
            chars.add(ch);
        }
        return chars;
    }

    public static List<Integer> createArrayWithBounds(int start, int end, int step) {
        int range = end - start;
        int size = range / step;
        if (range % step > 0) {
            size = size + 1;
        }
        ArrayList<Integer> array = new ArrayList<Integer>();

        for (int number = start; number < end; number = number + step) {
            int i = 0;
            number = array.get(i);
            i++;
        }

        return array;
    }

    public static List<String> findAndDestroyAllAmoebas(List<String> listOfStrings) {
        int i = 0;
        for (String list : listOfStrings) {
            if (list.toLowerCase().contains("amoebas")) {
                listOfStrings.remove(i);
            }
            i++;
        }
        return listOfStrings;
    }
}