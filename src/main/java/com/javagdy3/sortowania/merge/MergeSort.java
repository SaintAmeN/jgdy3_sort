package com.javagdy3.sortowania.merge;

import java.util.Arrays;

public class MergeSort {
    private static int licznikOperacji = 0;

    public static void sort(int[] tab) {
        licznikOperacji = 0;
        split(tab, 0, tab.length - 1);
        System.out.println("Licznik operacji: " + licznikOperacji);
    }

    private static void split(int[] tab, int from, int to) {
        if (from == to) {
            return;
        }

        int middle = (from + to) / 2;
        split(tab, from, middle);
        split(tab, middle + 1, to);

        merge(tab, from, middle, to);
    }

    private static void merge(int[] tab, int from, int middle, int to) {
        int[] kopia = Arrays.copyOf(tab, tab.length);

        int lewa = from;
        int prawa = middle + 1;

        int licznikWstawiania = from;
        while (lewa <= middle && prawa <= to) {
            licznikOperacji++;
            if (kopia[lewa] < kopia[prawa]) {
                tab[licznikWstawiania++] = kopia[lewa++];
            } else {
                tab[licznikWstawiania++] = kopia[prawa++];
            }
        }

        while (lewa <= middle) {
            tab[licznikWstawiania++] = kopia[lewa++];
            licznikOperacji++;
        }
        while (prawa <= to) {
            tab[licznikWstawiania++] = kopia[prawa++];
            licznikOperacji++;
        }
    }
    // n * log ( n)
    // 10 * 3.4
}
