package arraysDemo;

public class Arrays2 {
    public static void main(String[] args) {
        int [][] matrix = {{4,9,16,28,6},{5,5,12,3},{12,5}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("Element in position %d%d is %d%n", i, j, matrix);
            }

        }
    }
}
