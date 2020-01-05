package com.javagdy3.sortowania.quick;

public class QuickSort {
    private static int licznikInstrukcji = 0;

    public static void sort(int[] tab) {
        licznikInstrukcji = 0;
        quick(tab, 0, tab.length - 1);
        System.out.println("Licznik instrukcji: " + licznikInstrukcji);
    }

    private static void quick(int[] tab, int from, int to) {
        int middle = (from + to) / 2;

        int lewa = from;
        int prawa = to;

        int pivot = tab[middle];

        do {
            while (true) {
                licznikInstrukcji++;
                if (tab[lewa] < pivot) {
                    lewa++;
                } else {
                    break;
                }
            }
            while(true) {
                licznikInstrukcji++;
                if (tab[prawa] > pivot) {
                    prawa--;
                }else{
                    break;
                }
            }
            if (lewa <= prawa) {
                int pomocnicza = tab[lewa];
                tab[lewa] = tab[prawa];
                tab[prawa] = pomocnicza;
                lewa++;
                prawa--;
            }
        } while (lewa < prawa);

        if (from < prawa) {
            quick(tab, from, prawa);
        }
        if (lewa < to) {
            quick(tab, lewa, to);
        }
    }
}
