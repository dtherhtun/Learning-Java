package com.projecteuler.problem11;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static int[][] readNumberFromFile(String filename) {
        int[][] grid = new int[20][20];
        int i = 0;
        int j = 0;
        try (Scanner scanner = new Scanner(new FileReader(filename))) {
            while (scanner.hasNextInt()) {
                grid[i][j] = scanner.nextInt();
                j++;
                if (j == 20) {
                    j = 0;
                    i++;
                }
                if (i == 20) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return grid;
    }

    private static int product(int x, int y, int dx, int dy, int[][] grid) {
        int product = 1;
        for (int i = 0; i < 4; i++) {
            int nx = x + (i * dx), ny = y + (i * dy);
            if (nx < 0 || nx >= 20 || ny < 0 || ny >= 20) {
                return 0;
            }
            product *= grid[nx][ny];
        }
        return product;
    }

    private static int greatestProduct(int[][] grid) {
        int[][] directions = {{0, 1}, {1, 0}, {1, 1}, {1, -1}};
        int maxProduct = 0;
        int product = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                for (int[] direction : directions) {
                    product = product(i, j, direction[0], direction[1], grid);
                    if (maxProduct < product) {
                        maxProduct = product;
                    }
                }
            }
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        String filename = "./src/com/projecteuler/problem11/numbers.txt";
        int[][] grid = readNumberFromFile(filename);
        int maxProduct = greatestProduct(grid);
        System.out.println(maxProduct);
    }
}
