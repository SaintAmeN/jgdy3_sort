package com.javagdy3.sortowania.bubble;

public class BubbleSort {
    public static void sort(int[] tab) {
        int licznikInstrukcji = 0;

        for (int i = 0; i < tab.length; i++) { //
            for (int j = 0; j < tab.length - 1 - i; j++) {
                // j = 0
                licznikInstrukcji++;
                if (tab[j] > tab[j + 1]) {
                    int pomocnicza = tab[j + 1];
                    tab[j + 1] = tab[j];
                    tab[j] = pomocnicza;
                }
            }
        }

        System.out.println("Licznik: " + licznikInstrukcji);
    }
}
