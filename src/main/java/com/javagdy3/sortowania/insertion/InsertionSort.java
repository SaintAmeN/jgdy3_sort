package com.javagdy3.sortowania.insertion;

public class InsertionSort {
    public static void sort(int[] tab) {

        int licznikInstrukcji = 0;

        for (int i = 1; i < tab.length; i++) {
            int nowaLiczba = tab[i];

            int j = i - 1;

            while (j >= 0) { // idziemy w lewą stronę
                licznikInstrukcji++;

                if (tab[j] > nowaLiczba) { // porównujemy liczbę
                    tab[j + 1] = tab[j]; // wstawiamy w prawo to co jest większe
                    tab[j] = nowaLiczba; // swoją nową liczbę przesuwamy w lewo
                    j--; // idziemy w lewo (redukcja indeksu)
                } else {
                    break;
                }
            }
        }
        System.out.println("Licznik instrukcji: " + licznikInstrukcji);
    }
}
