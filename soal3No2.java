package ujianUKL;

import java.util.Scanner;

public class soal3No2 {
        public static String deteksiNegatif(int[] array) {
            String hasil = ""; 
            boolean elemenPertama = true; 
    
            for (int angka : array) {
                if (angka < 0) { 
                    if (elemenPertama) {
                        hasil += ", "; 
                    }
                    hasil += angka; 
                    elemenPertama = false; 
                }
            }
    
            return hasil;
        }
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
    
            System.out.println("--- MENGHITUNG ELEMEN NEGATIF ---");
            System.out.print("Masukkan jumlah elemen array yang di inginkan: ");
            int n = s.nextInt();

            int[] array = new int[n];
    
            System.out.println("-- Masukkan elemen ---");
            for (int i = 0; i < n; i++) {
                System.out.print("Elemen ke-" + (i + 1) + ": ");
                array[i] = s.nextInt();
            }
    
            String elemenNegatif = deteksiNegatif(array);
    
            if (elemenNegatif.isEmpty()) {
                System.out.println("Array tidak mengandung elemen negatif.");
            } else {
                System.out.println("Array mengandung elemen negatif: " + elemenNegatif + ".");
            }
    
            s.close();
        }
    }
