public class Latihan2 {
    public static void main(String[] args) {
        
        int angka = 1;
        System.out.println("Tabel 4x5:");
        for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 5; j++) { 
                System.out.print(angka + " ");
                angka++;
            }
            System.out.println();
        }

        angka = 1;
        System.out.println("\nTabel 3x3:");
        
        // Menggunakan label untuk menghentikan kedua loop jika angka > 20
        outerLoop:
        for (int i = 0; i < 7; i++) { 
            for (int j = 0; j < 3; j++) { 
                if (angka > 20) break outerLoop;  // Keluar dari kedua loop
                System.out.print(angka + " ");
                angka++;
            }
            System.out.println();
        }
    }
}
