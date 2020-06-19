package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("masukan nama dosen: ");
        String nD = sc.next();
        System.out.print("masukan nama kode dosen: ");
        int kD = sc.nextInt();
        System.out.print("masukan nama banyak kendaraan: ");
        int n = sc.nextInt();      
        Kendaraan kendaraans[] = new Kendaraan[n];
        Mesin mesin[] = new Mesin[n];
        Roda roda[] = new Roda[n];
        
        for (int i = 0; i < kendaraans.length; i++) {
            System.out.print("masukan nama jenis kendaraan"+ (i+1) + ": ");
            System.out.print("masukan nama nama merk"+ (i+1) + ": ");
            String mB = sc.next();
            System.out.print("masukan nama jenis mesin: "+ (i+1) + ": ");
            String ms = sc.next();
            System.out.print("masukan nama merk ban: "+ (i+1) + ": ");
            String rd = sc.next();
            mesin[i] = new Mesin(ms);
            roda[i] = new Roda(rd);
            kendaraans[i] = new Kendaraan(jB, mB, mesin[i], roda[i]);
        }
        sc.close();
        Dosen dosen = new Dosen(nD, kD, kendaraans);

        for (Kendaraan kendaraan : dosen.kendaraans) {
            System.out.println(kendaraan.getJenisK() +" " 
            + kendaraan.getMerkK() +" " 
            +kendaraan.getMesin().jenis +" " 
            + kendaraan.getRoda().merk);
        }



    }
}