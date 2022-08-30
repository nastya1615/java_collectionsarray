package practice.reverseArray;

public class Main {

    // используя данный метод, вы можете использовать ваши методы, и проверить их работу на разных
    // значений для проверки и отладки
    public static void main(String[] args) {

        String line = "Каждый охотник желает знать, где сидит фазан";

        String [] lineMassive = line.split(",?\\s+");

        ReverseArray revers = new ReverseArray();

        for (String word:revers.reverse(lineMassive)) {
            System.out.println(word);

        }
    }
}
