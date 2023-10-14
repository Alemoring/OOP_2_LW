public class Matrix {
    private int[][] matrix;
    private int len;

    public Matrix() {
        matrix = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = (int) (((Math.random() * 100) % 10) + 1);
            }
        }
    }

    public Matrix(int rows, int columns) {
        matrix = new int[rows][columns];
        len = rows * columns;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (((Math.random() * 100) % 10) + 1);
            }
        }
    }

    public float findFrequency() {
        return findFrequency(5);
    }

    public float findFrequency(int x) {
        int kol = 0; // Количество заданного числа в массиве
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == x)
                    kol += 1;
            }
        }
        return ((float) kol / len) * 100;
    }

    public void print() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
