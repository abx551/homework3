import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();

        System.out.println("Введите несколько строк для списка А:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listA.add(input);
        }

        System.out.println("Список А:");
        System.out.println(listA);

        System.out.println("Введите несколько строк для списка Б:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listB.add(input);
        }

        System.out.println("Список Б:");
        System.out.println(listB);


        List<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }
        System.out.println("Список С:");
        System.out.println(listC);

        Collections.sort(listC, Comparator.comparingInt(String::length));

        System.out.println("Отсортированный список С:");
        System.out.println(listC);

    }
}

