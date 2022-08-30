package practice.twoDimensionalArray;

public class TwoDimensionalArray {

    public static final char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        char[][] massiv = new char[size][size];

        for ( int i = 0; i < massiv.length;i++){

            for (int j = 0; j < massiv.length; j++){
                if(i==j ){
                    massiv[i][j]='X';

                }
                else {
                    massiv[i][j]=' ';
                }
                massiv[i][massiv.length-1-i]='X';



            }
        }

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ SYMBOL по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        return massiv;
    }
}
