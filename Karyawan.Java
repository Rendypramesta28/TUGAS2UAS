package Algow;

public class Karyawan {
// Superclass Karyawan
     String NIP;
     String nama;
     String bentukkelamin;
     int hari;
     int totalgaji;
     
     void Karyawan(){
         System.out.println("NIP : " + NIP);
         System.out.println("Nama : " + nama);
         System.out.println("Jenis Kelamin : " + bentukkelamin);
     }
     
     void AbsenKerja(){
         System.out.println("Absen Kerja : " + hari);
     }
     
     void HitungGaji(){
         System.out.println("Total Pendapatan : " + (hari*50000));
     }
}
 class Dosen extends Karyawan{
            String golongan;
            int sks;
            int upahtotal;
          
      void HitungGaji(){
          System.out.println("Gaji : " + (sks*upahtotal*hari));    
      }
 }
 class Staff extends Karyawan{
     
 } 
