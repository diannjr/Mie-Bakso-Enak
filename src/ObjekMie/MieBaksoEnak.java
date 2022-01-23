package ObjekMie;
import java.util.Scanner;

/**
 *
 * @author DIAN
 */
public class MieBaksoEnak {
    public void transaksiMieBakso() {
        Scanner input = new Scanner (System.in);
        int baksoAnakan = 15000, baksoGranat = 17000, baksoMercon = 20000, AnakanSet = 10000, GranatSet = 12000, MerconSet = 15000;
        int jumlahPesanan, totalHarga, uangBayar, uangKembalian;
        int ulang, i = 0;
                
        System.out.println("     TRANSAKSI MIE BAKSO ENAK");
        System.out.println("==================================");
        
        System.out.println("=========   MENU BAKSO   =========");
        System.out.println("1. Harga Bakso Anakan      = 15000\n2. Harga Bakso Granat      = 17000\n3. Harga Bakso Mercon      = 20000\n4. Harga Bakso Anakan 1/2  = 10000\n5. Harga Bakso Granat 1/2  = 12000\n6. Harga Bakso Mercon 1/2  = 15000");
        System.out.println("==================================");
        
        do {
            System.out.print("Silahkan Pilih Bakso  : ");
            int jenisBakso = input.nextInt();
            
            switch(jenisBakso) {
                case 1 : System.out.println("Bakso Anakan");
                         System.out.println("Berapa Porsi Bakso : ");
                         jumlahPesanan = input.nextInt();
                         
                         totalHarga = jumlahPesanan * baksoAnakan;
                         
                         System.out.println("Total Harga : " + totalHarga);
                         System.out.print("Uang Bayar : ");
                         uangBayar = input.nextInt();
                         uangKembalian = uangBayar - totalHarga;
                         
                         System.out.println(" ");
                         System.out.println("====== STRUK PEMBELIAN ======");
                         System.out.println("        MIEBAKSO ENAK        ");
                         System.out.println("=============================");
                         System.out.println(" ");
                         System.out.println("Jenis Bakso    : Bakso Anakan");
                         System.out.println("Jumlah Pesanan : " + jumlahPesanan);
                         System.out.println("Total Harga    : " + totalHarga);
                         System.out.println("Bayar          : " + uangBayar);
                         System.out.println("Uang Kembalian : " + uangKembalian);
                         System.out.println(" ");
                         System.out.println("======== TERIMAKASIH ========");
                         break;
                case 2 : System.out.println("Bakso Granat");
                         System.out.println("Berapa Porsi Bakso : ");
                         jumlahPesanan = input.nextInt();
                         
                         totalHarga = jumlahPesanan * baksoGranat;
                                                 
                         System.out.println("Total Harga : " + totalHarga);
                         System.out.println("Uang Bayar : ");
                         uangBayar = input.nextInt();
                         uangKembalian = uangBayar - totalHarga;
                         
                         System.out.println(" ");
                         System.out.println("====== STRUK PEMBELIAN ======");
                         System.out.println("        MIEBAKSO ENAK        ");
                         System.out.println("=============================");
                         System.out.println(" ");
                         System.out.println("Jenis Bakso    : Bakso Granat");
                         System.out.println("Jumlah Pesanan : " + jumlahPesanan);
                         System.out.println("Total Harga    : " + totalHarga);
                         System.out.println("Bayar          : " + uangBayar);
                         System.out.println("Uang Kembalian : " + uangKembalian);
                         System.out.println(" ");
                         if(jumlahPesanan >= 3) {
                            System.out.println("     Gratis 1  Teh Pucuk");
                         }
                         System.out.println("======== TERIMAKASIH ========");
                         break;
                case 3 : System.out.println("Bakso Mecon");
                         System.out.println("Berapa Porsi Bakso : ");
                         jumlahPesanan = input.nextInt();
                         
                         totalHarga = jumlahPesanan * baksoMercon;
                         
                         System.out.println("Total Harga : " + totalHarga);
                         System.out.println("Uang Bayar : ");
                         uangBayar = input.nextInt();
                         uangKembalian = uangBayar - totalHarga;
                         
                         System.out.println(" ");
                         System.out.println("====== STRUK PEMBELIAN ======");
                         System.out.println("        MIEBAKSO ENAK        ");
                         System.out.println("=============================");
                         System.out.println(" ");
                         System.out.println("Jenis Bakso    : Bakso Mercon");
                         System.out.println("Jumlah Pesanan : " + jumlahPesanan);
                         System.out.println("Total Harga    : " + totalHarga);
                         System.out.println("Bayar          : " + uangBayar);
                         System.out.println("Uang Kembalian : " + uangKembalian);
                         System.out.println(" ");
                         System.out.println("======== TERIMAKASIH ========");
                         break;
                case 4 : System.out.println("Bakso Anakan Setengah");
                         System.out.println("Berapa Porsi Bakso : ");
                         jumlahPesanan = input.nextInt();
                         
                         totalHarga = jumlahPesanan * AnakanSet;
                         
                         System.out.println("Total Harga : " + totalHarga);
                         System.out.println("Uang Bayar : ");
                         uangBayar = input.nextInt();
                         uangKembalian = uangBayar - totalHarga;
                         
                         System.out.println(" ");
                         System.out.println("====== STRUK PEMBELIAN ======");
                         System.out.println("        MIEBAKSO ENAK        ");
                         System.out.println("=============================");
                         System.out.println(" ");
                         System.out.println("Jenis Bakso    : Bakso Anakan 1/2");
                         System.out.println("Jumlah Pesanan : " + jumlahPesanan);
                         System.out.println("Total Harga    : " + totalHarga);
                         System.out.println("Bayar          : " + uangBayar);
                         System.out.println("Uang Kembalian : " + uangKembalian);
                         System.out.println(" ");
                         System.out.println("======== TERIMAKASIH ========");
                         break;
                case 5 : System.out.println("Bakso Granat Setengah");
                         System.out.println("Berapa Porsi Bakso : ");
                         jumlahPesanan = input.nextInt();
                         
                         totalHarga = jumlahPesanan * GranatSet;
                         
                         System.out.println("Total Harga : " + totalHarga);
                         System.out.println("Uang Bayar : ");
                         uangBayar = input.nextInt();
                         uangKembalian = uangBayar - totalHarga;
                         
                         System.out.println(" ");
                         System.out.println("====== STRUK PEMBELIAN ======");
                         System.out.println("        MIEBAKSO ENAK        ");
                         System.out.println("=============================");
                         System.out.println(" ");
                         System.out.println("Jenis Bakso    : Bakso Granat 1/2");
                         System.out.println("Jumlah Pesanan : " + jumlahPesanan);
                         System.out.println("Total Harga    : " + totalHarga);
                         System.out.println("Bayar          : " + uangBayar);
                         System.out.println("Uang Kembalian : " + uangKembalian);
                         System.out.println(" ");
                         if(jumlahPesanan >= 3) {
                            System.out.println("     Gratis 1  Teh Pucuk");
                         }
                         System.out.println("======== TERIMAKASIH ========");
                         break;
                case 6 : System.out.println("Bakso Mercon Setengah");
                         System.out.println("Berapa Porsi Bakso : ");
                         jumlahPesanan = input.nextInt();
                         
                         totalHarga = jumlahPesanan * MerconSet;
                         
                         System.out.println("Total Harga : " + totalHarga);
                         System.out.println("Uang Bayar : ");
                         uangBayar = input.nextInt();
                         uangKembalian = uangBayar - totalHarga;
                         
                         System.out.println(" ");
                         System.out.println("====== STRUK PEMBELIAN ======");
                         System.out.println("        MIEBAKSO ENAK        ");
                         System.out.println("=============================");
                         System.out.println(" ");
                         System.out.println("Jenis Bakso    : Bakso Mercon 1/2");
                         System.out.println("Jumlah Pesanan : " + jumlahPesanan);
                         System.out.println("Total Harga    : " + totalHarga);
                         System.out.println("Bayar          : " + uangBayar);
                         System.out.println("Uang Kembalian : " + uangKembalian);
                         System.out.println(" ");
                         System.out.println("======== TERIMAKASIH ========");
                         break;
                default: System.out.println("Maaf pilihan anda tidak terdaftar");
                         break;
            }            
            System.out.println(" ");
            System.out.print("Mau Pesan Lagi ?\n1. Ya\n2. Tidak");
            ulang = input.nextInt();
        } while (ulang == 1);
        
    }
 
}