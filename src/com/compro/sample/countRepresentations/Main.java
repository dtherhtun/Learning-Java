package com.compro.sample.countRepresentations;

public class Main {
    public static int countRepresentations(int numRupees) {
        if (numRupees == 0) return 0;
        int count = 0;
        int time = 0;

        for (int rupee20 = 0; rupee20 <= numRupees; rupee20 += 20) {
            for (int rupee10 = 0; rupee10 <= numRupees; rupee10 += 10) {
                for (int rupee5 = 0; rupee5 <= numRupees; rupee5 += 5) {
                    for (int rupee2 = 0; rupee2 <= numRupees; rupee2 += 2) {
                        for (int rupee1 = 0; rupee1 <= numRupees; rupee1++) {
                            time++;
                            if (rupee1 + rupee2 + rupee5 + rupee10 + rupee20 == numRupees) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(time);
        return count;
    }

    // minimize
    static int countRepresentation(int numRupees) {
        if (numRupees == 0) return 0;
        int count = 0;
        int time = 0;
        for (int rupee20 = 0; rupee20 <= (numRupees) / 20; rupee20++) {
            for (int rupee10 = 0; rupee10 <= (numRupees - (rupee20 * 20)) / 10; rupee10++) {
                for (int rupee5 = 0; rupee5 <= (numRupees - (rupee10 * 10 + rupee20 * 20)) / 5; rupee5++) {
                    for (int rupee2 = 0; rupee2 <= (numRupees - (rupee5 * 5 + rupee10 * 10 + rupee20 * 20)) / 2; rupee2++) {
                        for (int rupee1 = 0; rupee1 <= numRupees - (rupee2 * 2 + rupee5 * 5 + rupee10 * 10 + rupee20 * 20); rupee1++) {
                            time++;
                            if ((rupee1 + rupee2 * 2 + rupee5 * 5 + rupee10 * 10 + rupee20 * 20) == numRupees) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(time);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countRepresentations(12));
        System.out.println(countRepresentation(12));
    }
}
