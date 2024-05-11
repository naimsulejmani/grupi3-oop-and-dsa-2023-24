package oop.polymorphism;

public class Loja {
    private int[][] matrix = new int[4][4];

    //instance initializer block
    {
        System.out.println("E PARA");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                double rnd = Math.random(); // 0.0000 deri me 0.99999
                if (rnd < 0.34)
                    matrix[i][j] = -1;
                else if (rnd < 0.67)
                    matrix[i][j] = 0;
                else matrix[i][j] = 1;
            }
        }
    }

    public Loja() {
        System.out.println("E FUNDIT");
    }

    //instance initializer block
    {
        System.out.println("E DYTA");
    }
}
