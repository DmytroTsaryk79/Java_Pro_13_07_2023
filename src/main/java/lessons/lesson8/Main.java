package lessons.lesson8;

public class Main {
    public static void main(String[] args) {
        String inputString = "Hello Hillel school!";
        String reversedString = stringReverse(inputString);
        System.out.println("Рядок '" + inputString + "' у реверсованому вигляді: " + reversedString);
    }

    public static String stringReverse(String input) {
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();
        return reversed.toString();
    }
}