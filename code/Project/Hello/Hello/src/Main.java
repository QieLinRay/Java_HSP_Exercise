import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        System.out.printf("Hello and welcome!");
        int n = 1 + 2 + 3;
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}

class person {


    String name;
    int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public person(String name) {
        this.name = name;
    }

}