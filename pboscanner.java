// mengimpor Scanner ke program
import java.util.Scanner;

class pboscanner {

public static void main(String[] args) {
// deklarasi variabel
String nama, alamat;
int kelas, nilai;

// membuat scanner baru
Scanner keyboard = new Scanner(System.in);

// Tampilkan output ke user
System.out.println("### Pendataan Peserta Didik Kelas 11 ###");

System.out.print("Nama Pesdik: ");
// menggunakan scanner dan menyimpan apa yang diketik di variabel nama
nama = keyboard.nextLine();

// Tampilkan output lagi
System.out.print("Alamat: ");

// menggunakan scanner lagi
alamat = keyboard.nextLine();

System.out.print("Kelas: ");
kelas = keyboard.nextInt();

System.out.print("Nilai Akhir: ");
nilai = keyboard.nextInt();


// Menampilkan apa yang sudah simpan di variabel
System.out.println("--------------------");
System.out.println("Nama Pesdik: " + nama);
System.out.println("Alamat: " + alamat);
System.out.println("Kelas: " + kelas);
System.out.println("Nilai Akhir: Rp " + nilai);
}

}