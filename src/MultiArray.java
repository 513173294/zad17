import java.util.Arrays;
import java.util.Random;

public class MultiArray {
    int[][] tablica;

    public MultiArray(int m, int n) {
        this.tablica = new int[m][n];
        randomize();

    }

    void randomize() {
        Random random = new Random();
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = random.nextInt(100);
            }
        }

    }

    int findMin() {
        int min = 100;
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                if (tablica[i][j] < min) {
                    min = tablica[i][j];
                }
            }

        }
        return min;

    }

    int findMax() {
        int max = 0;
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                if (tablica[i][j] > max) {
                    max = tablica[i][j];
                }
            }

        }
        return max;

    }


    void print() {
        String values = new String();
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                values += tablica[i][j] + ", ";
            }
            values += "\n";
        }
        System.out.println(values);

    }
}



