//RENDY PRAMESTA SYAH : 227064516024
//FERDY SETYO HANDIKA : 227064516034
package Algow;
public class Main {
    public static void main(String[] args) {
        Karyawan BudakKorporat1 = new Karyawan();
        BudakKorporat1.NIP = "RPS28";
        BudakKorporat1.nama = "Rendy";
        BudakKorporat1.bentukkelamin = "Pejantan";
        BudakKorporat1.hari = 29;
        BudakKorporat1.Karyawan();
        BudakKorporat1.AbsenKerja();
        BudakKorporat1.HitungGaji();
        System.out.println();
        
        Dosen BudakKorporat2 = new Dosen();
        BudakKorporat2.NIP = "FSH18";
        BudakKorporat2.nama = "SamboMan";
        BudakKorporat2.bentukkelamin = "Pejantan";
        BudakKorporat2.hari = 35;
        BudakKorporat2.golongan = "1J";
        BudakKorporat2.sks = 8;
        BudakKorporat2.upahtotal = 250000;
        BudakKorporat2.Karyawan();
        BudakKorporat2.AbsenKerja();
        BudakKorporat2.HitungGaji();
        System.out.println();
        
        Staff BudakKorporat3 = new Staff();
        BudakKorporat3.NIP = "DA30";
        BudakKorporat3.nama = "Dennis";
        BudakKorporat3.bentukkelamin = "Pejantan";
        BudakKorporat3.hari = 20;
        BudakKorporat3.Karyawan();
        BudakKorporat3.AbsenKerja();
        BudakKorporat3.HitungGaji();
        System.out.println(); 
    } 
}
