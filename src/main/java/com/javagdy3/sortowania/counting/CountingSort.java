package com.javagdy3.sortowania.counting;

public class CountingSort {
    public static void sort(int[] tab) {
        int licznikInstrukcji = 0;
        // minimum to zawsze 0
        // max - do obliczenia

        // złożoność = n
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            licznikInstrukcji++;
            if (max < tab[i]) {
                max = tab[i];
            }
        }
        // max znaleziony

        // złożoność = n
        // jeśli maksymalna wartość to 10, to potrzebuje 11 miejsc
        int[] liczniki = new int[max + 1];
        for (int i = 0; i < tab.length; i++) {
            licznikInstrukcji++;
//            tab[i] == wartość która staje się indeksem w tablicy liczniki
            liczniki[tab[i]]++;
        }

        // złożoność = n
        int pozycjaWstawiania = 0;
        for (int i = 0; i < liczniki.length; i++) {
            for (int j = 0; j < liczniki[i]; j++) {
                licznikInstrukcji++;
                tab[pozycjaWstawiania++] = i;
            }
        }

        System.out.println("Licznik instrukcji: " + licznikInstrukcji);
    }
}
