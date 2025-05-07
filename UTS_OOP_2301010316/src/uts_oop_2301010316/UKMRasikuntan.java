package uts_oop_2301010316;

/**
 *
 * @author Liryana Purnama
 * TGL 28-04-2025
 */
import java.util.Scanner;

public class UKM_Rasikuntan {
    private static AnggotaUKM[] anggota = new AnggotaUKM[100];
    private static int jumlahAnggota = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.println("\n=== Aplikasi Pencatatan Anggota UKM Rasikuntan ===");
            System.out.println("1. Tambah Anggota");
            System.out.println("2. Tampilkan Anggota");
            System.out.println("3. Update Anggota");
            System.out.println("4. Hapus Anggota");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 
            
            switch(pilihan) {
                case 1:
                    tambahAnggota();
                    break;
                case 2:
                    tampilkanAnggota();
                    break;
                case 3:
                    updateAnggota();
                    break;
                case 4:
                    hapusAnggota();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private static void tambahAnggota() {
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("NIM: ");
        String nim = scanner.nextLine();
        
        System.out.print("Jurusan: ");
        String jurusan = scanner.nextLine();
        
        System.out.print("Divisi (Akademik/Humas/Kominfo): ");
        String divisi = scanner.nextLine();
        
        anggota[jumlahAnggota] = new AnggotaUKM(nama, nim, jurusan, divisi);
        jumlahAnggota++;
        System.out.println("Anggota berhasil ditambahkan!");
    }

    private static void tampilkanAnggota() {
        if(jumlahAnggota == 0) {
            System.out.println("Belum ada anggota terdaftar!");
            return;
        }
        
        for(int i = 0; i < jumlahAnggota; i++) {
            System.out.println("Anggota ke-" + (i+1));
            System.out.println(anggota[i]);
        }
    }

    private static void updateAnggota() {
        System.out.print("Masukkan NIM yang akan diupdate: ");
        String nim = scanner.nextLine();
        
        for(int i = 0; i < jumlahAnggota; i++) {
            if(anggota[i].getNim().equals(nim)) {
                System.out.print("Nama baru: ");
                anggota[i].setNama(scanner.nextLine());
                
                System.out.print("Jurusan baru: ");
                anggota[i].setJurusan(scanner.nextLine());
                
                System.out.print("Divisi baru: ");
                anggota[i].setDivisi(scanner.nextLine());
                
                System.out.println("Data berhasil diupdate!");
                return;
            }
        }
        System.out.println("Anggota dengan NIM " + nim + " tidak ditemukan!");
    }

    private static void hapusAnggota() {
        System.out.print("Masukkan NIM yang akan dihapus: ");
        String nim = scanner.nextLine();
        
        for(int i = 0; i < jumlahAnggota; i++) {
            if(anggota[i].getNim().equals(nim)) {
                // Geser elemen array
                for(int j = i; j < jumlahAnggota - 1; j++) {
                    anggota[j] = anggota[j+1];
                }
                jumlahAnggota--;
                System.out.println("Anggota berhasil dihapus!");
                return;
            }
        }
        System.out.println("Anggota dengan NIM " + nim + " tidak ditemukan!");
    }
}

