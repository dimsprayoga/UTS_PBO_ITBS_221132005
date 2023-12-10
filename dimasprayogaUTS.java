/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author dimasprayoga
 */
public class dimasprayogaUTS {
    class ResepResto {
        protected String bahanUtama;
        protected String caraMembuat;
        
        // Constructor
        public ResepResto (String bahanUtama, String caraMembuat) {
            this.bahanUtama = bahanUtama;
            this.caraMembuat =caraMembuat;
        }
        
        // Method to display recipe information
        public void infoResepResto() {
            System.out.println("Bahan Utama: " + bahanUtama);
            System.out.println("Cara Membuat: " + caraMembuat);
        }
    }
    
    // Child Class 1
    class MieKocok extends ResepResto {
        public String bahanKuah;
        public String bumbuHalus;
        public String bahanSambal;
        public String bahanPelengkap;
        
        // Overloaded Constructor
        public MieKocok(String bahanUtama, String caraMembuat, String bahanKuah, String bumbuHalus, String bahanSambal, String bahanPelengkap) {
            super(bahanUtama, caraMembuat);
            this.bahanKuah = bahanKuah;
            this.bumbuHalus = bumbuHalus;
            this.bahanSambal = bahanSambal;
            this.bahanPelengkap = bahanPelengkap;
        }
        
        // Method untuk menampilkan info resep
        public void infoResepResto() {
            super.infoResepResto();
            System.out.println("Bahan Kuah: " + bahanKuah);
            System.out.println("Bumbu Halus: " + bumbuHalus);
            System.out.println("Bahan Sambal : " + bahanSambal);
            System.out.println("Bahan Pelengkap : " + bahanPelengkap);
            
        }
    }
    
    // Kelas Turunan Sate
    class Sate extends ResepResto {
        public String bumbuHalus;
        public String bahanSambal;
        public String bahanPelengkap;
        
        // Overloading Konstruktor
        public Sate(String bahanUtama, String caraMembuat, String bumbuHalus, String bahanSambal, String bahanPelengkap) {
            super(bahanUtama, caraMembuat);
            this.bumbuHalus = bumbuHalus;
            this.bahanSambal = bahanSambal;
            this.bahanPelengkap = bahanPelengkap;
        }
        
        //method untuk menampilkan informasi resep
        public void infoResepResto() {
            super.infoResepResto();
            System.out.println("Bumbu Halus: " + bumbuHalus);
            System.out.println("Bahan Sambal: " + bahanSambal);
            System.out.println("Bahan Pelengkap: " + bahanPelengkap);
        }
    }
    
    // Kelas Utama
    public class ProgramResepSunda {
        public static void main(String[] args) {
            // Contoh penggunaan
           MieKocok mieKocok = new MieKocok("2250 gr mie jenis lebar", "Langkah-langkah membuat mie kocok", "1500 cc air", "4 siung bawang putih", "Sambal vabai rawit", "Kerupuk merah");
           mieKocok.infoResepResto();
           
           Sate sate = new Sate("500 gr daging sapi", "Langkah-langkah membuat sate", "2 sdm bawang goreng", "Sambal cabai rawit","Kecap, irisan cabai dan tomat");
           sate.infoResepResto();
        }
    }
    


