package lessons.lesson10;

public class ArrayValueCalculator {
    public static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        int sum = 0;

        if (array.length != 4 || array[0].length != 4) {
            throw new ArraySizeException("Масив повинен бути розміром 4x4");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Невірні дані в комірці [" + i + "][" + j + "]");
                }
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"},
                {"10", "11", "12"}
        };

        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "abc", "15", "16"}
        };

        try {
            int result = doCalc(validArray);
            System.out.println("Результат розрахунку: " + result);


        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
