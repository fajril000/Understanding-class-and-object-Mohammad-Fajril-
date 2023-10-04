import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();
        int hasil = 1;
        for (int i = 1; i <= 2; i++) {
            hasil *= bilangan;
        }
        System.out.println("Hasil pangkat dua dari " + bilangan + " adalah " + hasil);
    }
}


// Analisis

// Kode di atas adalah program sederhana dalam bahasa pemrograman Java yang melakukan perhitungan pangkat dua dari sebuah bilangan yang dimasukkan oleh pengguna. Berikut adalah analisis singkatnya:

// 1. Kode mengimpor pustaka `java.util.Scanner` untuk membaca input dari pengguna.

// 2. Program meminta pengguna untuk memasukkan sebuah bilangan dengan pesan "Masukkan bilangan:".

// 3. Bilangan yang dimasukkan oleh pengguna disimpan dalam variabel `bilangan` dengan menggunakan `input.nextInt()`.

// 4. Hasil pangkat dua dari bilangan tersebut dihitung dengan mengalikan `bilangan` dengan dirinya sendiri.

// 5. Hasil perhitungan tersebut langsung dicetak ke layar dengan pesan "Hasil pangkat dua dari " + bilangan + " adalah " diikuti oleh hasilnya.

// simulasi perhitungan data untuk bilangan 5:
// Masukkan bilangan: 5    
// Hasil pangkat dua dari 5 adalah 25
