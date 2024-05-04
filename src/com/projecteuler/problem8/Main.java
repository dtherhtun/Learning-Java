package com.projecteuler.problem8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static long findGreatestProduct(String filename, int adjacentDigits) {
        String number = readNumberFromFile(filename);
        long maxProduct = 0;

        for (int i = 0; i <= number.length() - adjacentDigits; i++) {
            long product = 1;
            for (int j = 0; j < adjacentDigits; j++) {
                int digit = Character.getNumericValue(number.charAt(i + j));
                product *= digit;
            }
            maxProduct = Math.max(maxProduct, product);
        }

        return maxProduct;
    }

    private static String readNumberFromFile(String filename) {
        StringBuilder number = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                number.append(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return number.toString();
    }

    public static void main(String[] args) {
        String filename = "./src/com/projecteuler/problem8/numbers.txt";
        int adjacentDigits = 13;
        long greatestProduct = findGreatestProduct(filename, adjacentDigits);
        System.out.println(greatestProduct);
    }
}
